public class Dealer implements IDealer{

    private Deck deck = new Deck();

    public Dealer(Deck deck){
        this.deck = deck;
    }

    public void shuffle(){
        int numCards = deck.size();

        for(int i = 0; i < deck.size() -1; i++){
            int randomIndex     = (int)(Math.random() * numCards);
            Card randomCard     = deck.getFrom(randomIndex);
            Card currentCard    = deck.getFrom(i);

            deck.replace(randomIndex, currentCard);
            deck.replace(i, randomCard);
        }
    }

    public Card dealCard(){
        return deck.getTop();
    }
}
