public class Main {
    public static void main(String[] args) {
        Card card = new Card(Card.DIAMONDS, Card.KING);
        card.show();
        card.faceUp();
        card.show();
    }
}