package ie.dcu.computing.ca314.g10.pokerproject;

import ie.dcu.computing.ca314.g10.pokerproject.player.Player;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class GameController {

    Player localPlayer;

    // Player passes their name from menu prompt to this scene
    public void setPlayerName(String playerName) {
        addNewPlayer(playerName);
    }


    // Handle this on server side only later?
    private void addNewPlayer(String playerName){
        localPlayer = new Player();
    }
}