
/**
 * Write a description of class Game here.
 *
 * @author (Linda Dominguez)
 * @version (2/23/22)
 * 
 * The purpose is to test the Deck Class.
 */
public class Game
{
    public static void main(String[] args) {
        Deck newDeckTest = new Deck();

        // Print the initial state of the deck
        System.out.println("Starting Deck:" + newDeckTest);

        //Deck after cut function
        newDeckTest.cut();
        System.out.println("Cut Deck:" + newDeckTest);

        // Shuffle the deck and print the new state
        newDeckTest.shuffle();
        System.out.println("Deck after shuffle:" + newDeckTest);
    }
}

    