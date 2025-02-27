import java.util.ArrayList;

public class Deck implements IDeck{

    private ArrayList<Card> deck = new ArrayList<Card>();

    private void buildCards(){

        // Diamonds
        deck.add(new Card(Card.DIAMONDS, Card.TWO));
        deck.add(new Card(Card.DIAMONDS, Card.THREE));
        deck.add(new Card(Card.DIAMONDS, Card.FOUR));
        deck.add(new Card(Card.DIAMONDS, Card.FIVE));
        deck.add(new Card(Card.DIAMONDS, Card.SIX));
        deck.add(new Card(Card.DIAMONDS, Card.SEVEN));
        deck.add(new Card(Card.DIAMONDS, Card.EIGHT));
        deck.add(new Card(Card.DIAMONDS, Card.NINE));
        deck.add(new Card(Card.DIAMONDS, Card.TEN));
        deck.add(new Card(Card.DIAMONDS, Card.JACK));
        deck.add(new Card(Card.DIAMONDS, Card.QUEEN));
        deck.add(new Card(Card.DIAMONDS, Card.KING));
        deck.add(new Card(Card.DIAMONDS, Card.ACE));

        // Hearts
        deck.add(new Card(Card.HEARTS, Card.TWO));
        deck.add(new Card(Card.HEARTS, Card.THREE));
        deck.add(new Card(Card.HEARTS, Card.FOUR));
        deck.add(new Card(Card.HEARTS, Card.FIVE));
        deck.add(new Card(Card.HEARTS, Card.SIX));
        deck.add(new Card(Card.HEARTS, Card.SEVEN));
        deck.add(new Card(Card.HEARTS, Card.EIGHT));
        deck.add(new Card(Card.HEARTS, Card.NINE));
        deck.add(new Card(Card.HEARTS, Card.TEN));
        deck.add(new Card(Card.HEARTS, Card.JACK));
        deck.add(new Card(Card.HEARTS, Card.QUEEN));
        deck.add(new Card(Card.HEARTS, Card.KING));
        deck.add(new Card(Card.HEARTS, Card.ACE));

        // Spades
        deck.add(new Card(Card.SPADES, Card.TWO));
        deck.add(new Card(Card.SPADES, Card.THREE));
        deck.add(new Card(Card.SPADES, Card.FOUR));
        deck.add(new Card(Card.SPADES, Card.FIVE));
        deck.add(new Card(Card.SPADES, Card.SIX));
        deck.add(new Card(Card.SPADES, Card.SEVEN));
        deck.add(new Card(Card.SPADES, Card.EIGHT));
        deck.add(new Card(Card.SPADES, Card.NINE));
        deck.add(new Card(Card.SPADES, Card.TEN));
        deck.add(new Card(Card.SPADES, Card.JACK));
        deck.add(new Card(Card.SPADES, Card.QUEEN));
        deck.add(new Card(Card.SPADES, Card.KING));
        deck.add(new Card(Card.SPADES, Card.ACE));

        // Clubs
        deck.add(new Card(Card.CLUBS, Card.TWO));
        deck.add(new Card(Card.CLUBS, Card.THREE));
        deck.add(new Card(Card.CLUBS, Card.FOUR));
        deck.add(new Card(Card.CLUBS, Card.FIVE));
        deck.add(new Card(Card.CLUBS, Card.SIX));
        deck.add(new Card(Card.CLUBS, Card.SEVEN));
        deck.add(new Card(Card.CLUBS, Card.EIGHT));
        deck.add(new Card(Card.CLUBS, Card.NINE));
        deck.add(new Card(Card.CLUBS, Card.TEN));
        deck.add(new Card(Card.CLUBS, Card.JACK));
        deck.add(new Card(Card.CLUBS, Card.QUEEN));
        deck.add(new Card(Card.CLUBS, Card.KING));
        deck.add(new Card(Card.CLUBS, Card.ACE));
    }

    public Deck(){
        buildCards();
    }

    public Card getTop(){
        if(!deck.isEmpty()){
            return deck.removeFirst();
        }
        return null;
    }

    public void setBottom(Card card){
        deck.addLast(card);
    }

    public Card getFrom(int index){
        if(index <= deck.size() -1 && index > -1){
            return deck.get(index);
        }
        return null;
    }

    public void replace(int index, Card card){
        if(index <= deck.size() -1 && index > -1){
            deck.set(index, card);
        }
    }

    public int size(){
        return deck.size();
    }

}
