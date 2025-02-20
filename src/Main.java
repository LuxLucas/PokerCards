import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(2);

        Card card = new Card(Card.DIAMONDS, Card.KING);
        card.show();
        card.faceUp();
        card.show();

        System.out.println(intArray.toString());
        System.out.println(intArray.size());
    }
}