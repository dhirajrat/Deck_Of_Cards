import java.util.ArrayList;

/**
 *    Class Main for Main method
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to deck Of cards");

        ArrayList<Card> oneDeck = new ArrayList();
        DeckOfCards.buildDeckOfCards(oneDeck);


    }
}
