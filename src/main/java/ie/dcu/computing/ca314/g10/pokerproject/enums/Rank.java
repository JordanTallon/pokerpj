package ie.dcu.computing.ca314.g10.pokerproject.enums;

/**
 * Represents the possible ranks for a playing card.
 */
public enum Rank {
    ACE(14),
    KING(13),
    QUEEN(12),
    JACK(11),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    /**
     * Gets the numeric value of the rank.
     *
     * @return The card rank as an integer.
     */
    public int getValue() {
        return value;
    }
}
