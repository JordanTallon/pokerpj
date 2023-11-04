package ie.dcu.computing.ca314.g10.pokerproject.game;

import ie.dcu.computing.ca314.g10.pokerproject.core.Deck;
import ie.dcu.computing.ca314.g10.pokerproject.enums.Status;
import ie.dcu.computing.ca314.g10.pokerproject.player.Player;
import ie.dcu.computing.ca314.g10.pokerproject.player.Pot;
import ie.dcu.computing.ca314.g10.pokerproject.ui.UserInterface;

import java.util.List;

public class Game {
    public Status gameStatus;
    public Deck gameDeck;
    public Pot gamePot;
    public List< Round > gameRounds;
    public Player[] activePlayers;
    public Player[] foldedPlayers;
    public UserInterface UI;
    /**
     * Starts the poker game.
     */
    public void startGame() {
        // TODO
    }
    /**
     * Ends the poker game.
     */
    public void endGame() {
        // TODO
    }
    /**
     * Deals cards to the players.
     */
    public void dealCards() {
        // TODO
    }
    /**
     * Determines the winner of the poker
     game.
     *
     * @return The winning player.
     */
    public Player determineWinner() {
        // TODO
        return null;
    }
}