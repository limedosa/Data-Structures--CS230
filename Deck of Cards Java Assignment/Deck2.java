// public class Deck
// {

// // instance variables - replace the example below with your own
// private int currentCards;
// private static final int totalCards = 52;
// private Card [] cards;

// /**
// * Constructor for objects of class Deck
// */
// public Deck()
// {
// cards = new Card[totalCards];
// int position = 0 ;
// String [] CardOptions = {"Diamonds", "Clubs", "Spades", "Hearts"};
// for (String card : CardOptions){
// for (int newValue = 1; newValue < 14; newValue ++){
// cards[position] = new Card (card, newValue);
// position ++;
// }
// }
// // return cards; 

// }

public class Deck2{
    private int numCards; 
    private final int TOTAL_CARDS = 52; 
    private Card[] cards; 

    /**
    // // // // // * Constructs a new Deck object with all 52 unique cards.
    // // // // // */
    public Deck2() {
        cards = new Card[TOTAL_CARDS];
        int position = 0 ;
        String [] CardOptions = {"Diamonds", "Clubs", "Spades", "Hearts"};
        for (String card : CardOptions){
            for (int newValue = 1; newValue < 14; newValue ++){
                cards[position] = new Card (card, newValue);
                position ++;
            }
        }
    }

    /**
     * Returns a String representation of the Deck.
     * 
     * @return a String representation of the Deck
     */
    public String toString() {
        String result = "";
        for (Card card : cards) {
            result += card.toString() + "\n";
        }
        return result;
    }

    /**
     * Picks a random number between 1 and the number of cards in the Deck, splits the deck into two piles,
     * and rearranges the piles in the Deck so that the top pile goes to the bottom of the Deck.
     */
    public void cut() {
        int splitIndex = (int) (Math.random() * numCards) + 1;
        Card[] topPile = new Card[splitIndex];
        Card[] bottomPile = new Card[numCards - splitIndex];
        for (int i = 0; i < splitIndex; i++) {
            topPile[i] = cards[i];
        }
        for (int i = splitIndex; i < numCards; i++) {
            bottomPile[i - splitIndex] = cards[i];
        }
        for (int i = 0; i < numCards; i++) {
            if (i < numCards - splitIndex) {
                cards[i] = bottomPile[i];
            } else {
                cards[i] = topPile[i - (numCards - splitIndex)];
            }
        }
    }

    /**
     * Helper method to find the index of a specified Card object in the Deck.
     * 
     * @param card the Card object to find the index of
     * @return the index of the Card object in the Deck, or -1 if it is not found
     */
    private int findCardIndex(Card card) {
        for (int i = 0; i < numCards; i++) {
            if (cards[i].equals(card)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Helper method to remove a specified Card object from the Deck.
     * 
     * @param card the Card object to remove
     */
    private void removeCard(Card card) {
        int index = findCardIndex(card);
        for (int i = index; i < numCards - 1; i++) {
            cards[i] = cards[i + 1];
        }
        cards[numCards - 1] = null;
        numCards--;
    }

}