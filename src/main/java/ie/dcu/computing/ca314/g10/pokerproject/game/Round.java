package ie.dcu.computing.ca314.g10.pokerproject.game;

import ie.dcu.computing.ca314.g10.pokerproject.enums.Phase;
import ie.dcu.computing.ca314.g10.pokerproject.player.Chip;
import ie.dcu.computing.ca314.g10.pokerproject.player.Player;

import java.util.List;

public class Round {
    public Player activePlayer;
    public Phase bettingPhase;
    /**
     * Starts the poker round.
     */
    public void startRound() {
        // TODO
    }
    /*
     ** Gives a card to the player.
     */
    public void giveCard() {
        // TODO
    }
    /**
     * Shows the community cards to the
     players.
     */
    public void showCommunityCards() {
        // TODO
    }
    /**
     * Adds chips to the pot from a player.
     *
     * @param player The player adding the
    chips.
     * @param amount The amount of chips
    being added.
     */
    public void addChipsToPot(Player player,
                              List<Chip> amount) {
        // TODO
    }
}