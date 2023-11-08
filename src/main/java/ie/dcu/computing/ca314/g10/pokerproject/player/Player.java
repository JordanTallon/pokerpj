package ie.dcu.computing.ca314.g10.pokerproject.player;

import ie.dcu.computing.ca314.g10.pokerproject.core.Hand;
import ie.dcu.computing.ca314.g10.pokerproject.interfaces.Playable;
import java.util.List;
public class Player implements Playable {
    /** The name displayed for the player. */
    private String displayName;
    /** The total amount of chips the player
     has. */
    public int chipsAmount;
    /** List of individual chip objects the
     player has. */
    public List < Chip > chips;
    /** The hand of cards assigned to the
     player. */
    public Hand hand;
    /**
     * Allows the player to check.
     */

    public Player (String displayName, int startingChips){
        this.displayName = displayName;
        this.chipsAmount = startingChips;
    }
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