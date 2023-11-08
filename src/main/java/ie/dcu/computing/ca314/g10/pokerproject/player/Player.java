package ie.dcu.computing.ca314.g10.pokerproject.player;

import ie.dcu.computing.ca314.g10.pokerproject.core.Hand;
import ie.dcu.computing.ca314.g10.pokerproject.interfaces.Playable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.util.List;
public class Player implements Playable {

    /**  Coordinates for rendering the player board */
    private double xPosition;
    private double yPosition;

    /** Player pane, parent to all player styling */
    public StackPane container;

    /** UI Labels used in the player pane */
    private Label nameLabel;
    private Label chipLabel;
    private Label actionLabel;

    /** The name displayed for the player. */
    private String displayName;
    /** The total amount of chips the player has. */
    public int chipCount;
    /** List of individual chip objects the player has. */
    public List <Chip> chips;
    /** The hand of cards assigned to the player. */
    public Hand hand;

    public Player (String displayName, int startingChips, int x, int y){
        // Create player UI
        buildContainer();
        addContainerLabels();

        // Set player's position (where they are on the board)
        setPosition(x, y);

        // Update player information
        setDisplayName(displayName);
        setChipCount(startingChips);
    }


    private void setChipCount(int newChipCount) {
        this.chipCount = newChipCount;
        this.chipLabel.setText("" + newChipCount);
    }

    private void setDisplayName(String displayName) {
        this.displayName = displayName;
        this.nameLabel.setText(displayName.toUpperCase());
    }

    /** Create the player container */
    private void buildContainer() {
        this.container = new StackPane();
        this.container.getStyleClass().add("player-container");
    }

    /** Adds the Player UI labels to the Player container */
    private void addContainerLabels() {
        Label nameLabel = new Label("PLAYER NAME");

        this.nameLabel = createLabel("PLAYER NAME", "player-name", Pos.TOP_CENTER, new Insets(33,0,0,0));
        this.chipLabel = createLabel("CHIP TOTAL", "player-total", Pos.TOP_CENTER, new Insets(48,0,0,0));
        this.actionLabel = createLabel("ACTION", "player-action", Pos.BOTTOM_CENTER, new Insets(0,0,32,0));

        this.container.getChildren().addAll(this.nameLabel, this.chipLabel, this.actionLabel);
    }

    /** Helper when creating labels to avoid repetition */
    private Label createLabel(String text, String styleClass, Pos position, Insets margin) {
        Label label = new Label(text);
        label.getStyleClass().add(styleClass);
        StackPane.setAlignment(label, position);
        StackPane.setMargin(label, margin);
        return label;
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