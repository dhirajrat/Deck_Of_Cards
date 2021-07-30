import java.util.ArrayList;

/**
 *  Deck Of Cards class.
 */
public class DeckOfCards {
    public static ArrayList<Card> buildDeckOfCards(ArrayList<Card> deckOfCards){
        String[] suits = {"club","diamond","heart","spade"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
        for(String suit : suits){
            for (String rank : ranks){
                Card oneCard = new Card(suit,rank);   //building one card
                deckOfCards.add(oneCard);   // Adding that card
                System.out.println(oneCard.toString()+" card created");
            }
        }
        return deckOfCards;
    }
}
