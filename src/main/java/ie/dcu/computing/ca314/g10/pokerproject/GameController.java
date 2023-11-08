package ie.dcu.computing.ca314.g10.pokerproject;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class GameController {
    private String playerName;

    // Player passes their name from menu prompt to this scene
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}