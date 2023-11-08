package ie.dcu.computing.ca314.g10.pokerproject.player;

import ie.dcu.computing.ca314.g10.pokerproject.core.Hand;
import ie.dcu.computing.ca314.g10.pokerproject.interfaces.Playable;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.util.List;
public class Player implements Playable {

    /**  Coordinates for rendering the player board */
    private double xPosition;
    private double yPosition;

    /** Player pane, contains all player CSS */
    public StackPane container;

    /** The name displayed for the player. */
    private String displayName;
    /** The total amount of chips the player has. */
    public int chipsAmount;
    /** List of individual chip objects the player has. */
    public List <Chip> chips;
    /** The hand of cards assigned to the player. */
    public Hand hand;

    public Player (String displayName, int startingChips, int x, int y){
        this.displayName = displayName;
        this.chipsAmount = startingChips;
        buildContainer();
        setPosition(x, y);
    }

    /** Create the player container */
    public void buildContainer() {
        this.container = new StackPane();
        this.container.getStyleClass().add("player-container");
    }

    /**  Method to update the position if needed. (maybe when a player joins or leaves) */
    public void setPosition(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
        this.container.setTranslateX(xPosition);
        this.container.setTranslateY(yPosition);
    }

    /**
     * Allows the player to check.
     */
    @Override
    public void check() {
        // TODO
    }
    /**
     * Allows the player to place a bet.
     * @param amount The amount to bet.
     */
    @Override
    public void bet(int amount) {
        // TODO
    }
    /**
     * Allows the player to fold.
     */
    @Override
    public void fold() {
        // TODO
    }
    /**
     * Allows the player to raise the current
     bet.
     */
    @Override
    public void raise() {
        // TODO
    }
    /**
     * Allows the player to call.
     */
    @Override
    public void call() {
        // TODO
    }
    /**
     * Allows the player to go all-in.
     */
    @Override
    public void goAllIn() {
        // TODO
    }
    /**
     * Retrieves the display name of the
     player.
     * @return The player's display name.
     */
    public String getDisplayName() {
        return this.displayName;
    }
}