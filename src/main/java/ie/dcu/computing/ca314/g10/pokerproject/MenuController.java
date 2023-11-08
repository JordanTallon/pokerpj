package ie.dcu.computing.ca314.g10.pokerproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

import java.io.IOException;
import java.util.Optional;

public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onJoinGameClick(){
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Enter Name");
        dialog.setHeaderText(null);
        dialog.setContentText("Please enter your name:");


        Optional<String> result = dialog.showAndWait();

        if(result.isPresent()){
            String name = result.get().trim();

            // Prompt for name input once again if the user failed to give a name.
            if(name.isEmpty())
            {
                onJoinGameClick();
                return;
            }

            // Set player name
            System.out.println("Your name: " + name);


            try {
                // Load the Game scene
                FXMLLoader gameLoader = new FXMLLoader(getClass().getResource("game-view.fxml"));
                // This loads the FXML file and initializes the controller
                Parent gameView = gameLoader.load();

                // Retrieve the controller
                GameController gameController = gameLoader.getController();
                // Pass player's name to the Game scene
                gameController.setPlayerName(name);

                // Get the current scene and set the root to the loaded FXML
                welcomeText.getScene().setRoot(gameView);
            } catch (IOException e) {
                // I don't think this should ever trigger but just in case let's naively print a stack trace :D.
                e.printStackTrace();
            }
        }
    }

    @FXML
    protected  void onExitClick(){
        Platform.exit();
    }
}