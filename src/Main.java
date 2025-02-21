public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);

        dealer.shuffle();

        while(deck.size() != 0){
            System.out.println(deck.size());
            Card card = dealer.dealCard();
            card.faceUp();
            card.show();
        }

        System.out.println(deck.size());
    }
}