package ie.dcu.computing.ca314.g10.pokerproject;

import ie.dcu.computing.ca314.g10.pokerproject.player.Player;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import java.util.Optional;

public class GameController {

    @FXML
    private VBox tableBackground; // Reference to the tableBackground pane

    // Represents the player this client owns
    Player localPlayer;

    // Game settings (perhaps move this elsewhere later?)
    // How many chips a new player starts with
    int startingChips = 1000;

    // Player passes their name from menu prompt to this scene
    public void setPlayerName(String playerName) {
        addNewPlayer(playerName);
    }

    // Handle this on server side only later?
    private void addNewPlayer(String displayName){
        localPlayer = new Player(displayName, startingChips, 0, 0);
        System.out.println(localPlayer.getDisplayName());
        // Add the player's Container container to the scene
        tableBackground.getChildren().add(localPlayer.container);
    }
}