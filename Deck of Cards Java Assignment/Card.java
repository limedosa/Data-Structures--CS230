
/**
 * Card
 *
 * @author Smaranda Sandu, stella K
 * @version 2/15
 */
public class Card
{
    //In a common deck of cards, expect the suit to be one of the follwoing:
    //"Diamonds", "Clubs", "Spades", "Hearts"
    //and the value to be
    //from 1 to 13 (11 is Jack, 12 is Queen, 13 is King)
    private String suit;
    private int value; 

    /**
     * Constructor for objects of class Card
     * 
     * @param s the suit of the card
     * @param v the value of the card
     */
    public Card(String s, int v)
    {
        suit = s;
        value = v;
    }

    /**
     * Getter for suit
     * 
     * @return the suit of the card
     */
    public String getSuit() {
        return suit;
    }
    
    /**
     * Getter for value
     * 
     * @return the value of the card
     */
    public int getValue() {
        return value;
    }
    
    /**
     * String representation of a card
     * 
     * @return string representation of the card
     */
    public String toString() {
        return value + " of " + suit;
    }

    /**
     * Method that checks when two cards are equal.
     * Two cards are considered equal iff they ahve the same suit and the same value
     * 
     * @param c the card this (the invoking) object is compared against
     * @return true if this card and the input one are equal, false otherwise
     */
    public boolean equals(Card c) {
        return (this.suit.equals(c.suit)) && this.value==c.value;
    }
    
    
    public static void main(String[] args) {
        Card c1 = new Card("Diamonds", 3);
        System.out.println(c1);
        
        Card c2 = new Card("Hearts", 10);
        System.out.println(c2);
        
        System.out.println(c1.equals(c2));
    }
}
