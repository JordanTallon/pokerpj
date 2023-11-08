package ie.dcu.computing.ca314.g10.pokerproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

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
        }
    }

    @FXML
    protected  void onExitClick(){
        Platform.exit();
    }
}