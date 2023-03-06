
/**
 * Write a description of class Deck here.
 *
 * @author (Linda Dominguez)
 * @version (2/21/23)
 */
import java.util.Random;
public class Deck
{

    // instance variables - replace the example below with your own
    private int currentCards;
    private static final int totalCards = 52;
    private Card [] cards;

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        cards = new Card[totalCards];
        int position = 0 ;
        String [] CardOptions = {"Diamonds", "Clubs", "Spades", "Hearts"};
        for (String card : CardOptions){
            for (int newValue = 1; newValue < 14; newValue ++){
                cards[position] = new Card (card, newValue);
                position ++;
            }
        }
        // return cards; 

    }
    // public String toString []{

    // }
        /**
     * Returns a String representation of the Deck of cards.
     * 
     */
    public String toString() {
        String allcards = "";
        for (Card card : cards) {
            allcards += card.toString() + "\n";
        }
        return allcards;
    }

    
    /**
     * Returns a cut, with shifted cards for the Deck of cards.
     * 
     */
    public void cut (){
        int startAt;
        Random randomCutGenerator = new Random ();
        int randomCut = randomCutGenerator.nextInt(totalCards) + 1;

        Card [] cutDeck = new Card[totalCards];
        int position = 0;
        for (startAt = 0; startAt < randomCut ; startAt ++){
            cutDeck[startAt] = cards[position];
            position ++;
        }
        for(startAt = randomCut; startAt <totalCards; startAt++){
            cutDeck[startAt] = cards [position];
            position ++;}

        for (startAt = 0; startAt < totalCards; startAt ++){
            cards[startAt] = cutDeck[startAt];
        }

        // String pile1 = CardOptions.substring(randomCut, 
    }

    
        /**
     * Helps remove a card.
     * 
     */
    private void removeCard(int index) {
        for (int i = index; i < currentCards - 1; i++) {
            cards[i] = cards[i + 1];
        }
        cards[currentCards - 1] = null;
        currentCards--;
    }
    
            /**
     * Finds the index of a card
     * HELPER
     * 
     */
    private int findCardIndex(Card card) {
        for (int i = 0; i < totalCards; i++) {
            if (cards[i].equals(card)) {
                return i;
            }
        }
        return -1;
    }
    // public void shuffle() {
    // Random rand = new Random();
    // Card[] shuffledDeck = new Card[totalCards];

    // for (int i = 4ard(findCardIndex);
        // shuffledDeck[i] = randomCard;
    // }
    
    
                /**
     shuffles the cards
     * 
     */
    public void shuffle() {
        Card[] newShuffleDeck = new Card[currentCards];
        int i = 0;
        while (currentCards > 0) {
            int indexToRemove = findCardIndex();
            newShuffleDeck[i++] = cards[indexToRemove];
            removeCard(indexToRemove);
        }
        cards = newShuffleDeck;
    }
}
