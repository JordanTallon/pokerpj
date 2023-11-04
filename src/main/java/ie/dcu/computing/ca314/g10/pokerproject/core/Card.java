package ie.dcu.computing.ca314.g10.pokerproject.core;

import ie.dcu.computing.ca314.g10.pokerproject.enums.Rank;
import ie.dcu.computing.ca314.g10.pokerproject.enums.Suit;

public class Card {
    
    private Suit suit;
    private Rank rank;

    private static final String rankShorthand = "0123456789TJQKA";

    public Card(Rank rank, Suit suit)
    {
        setSuit(suit);
        setRank(rank);
    }

    private void setSuit(Suit suit){
        this.suit = suit;
    }

    private void setRank(Rank rank){
        this.rank = rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return The card's suit enum.
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return The card's rank enum.
     */
    public Rank getRank() {
        return this.rank;
    }

    /**
     * Gets the rank of the card as an integer.
     *
     * @return The card's rank value.
     */
    public int getRankValue() {
        return this.rank.getValue();
    }

    /**
     * Gets the name of the card in a compact format.
     *
     * <p>Example</p>
     * <pre>
     *     {@code
     *      Card exampleCard = new Card(Rank.FIVE, Suit.HEARTS);
     *      System.out.println(exampleCard.getShortName()); // Outputs: '5H'
     *     }
     * </pre>
     * @return The card name as a compact string.
     */
    public String getShortName() {
        // Maps the value of a rank to a character representation (index of rankShorthand)
        char rankCode =  rankShorthand.charAt(getRankValue());
        // Takes the first character of the suit. For example: SPADES = S.
        char suitCode = this.suit.toString().charAt(0);
        return rankCode + "" + suitCode;
    }
}