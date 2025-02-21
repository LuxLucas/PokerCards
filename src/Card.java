public class Card implements ICard{

    private int suit;
    private int value;
    private boolean faceUp;

    // Naipes
    public static final int DIAMONDS    = 4;
    public static final int HEARTS      = 3;
    public static final int SPADES      = 6;
    public static final int CLUBS       = 5;

    // Valores
    public static final int TWO     = 2;
    public static final int THREE   = 3;
    public static final int FOUR    = 4;
    public static final int FIVE    = 5;
    public static final int SIX     = 6;
    public static final int SEVEN   = 7;
    public static final int EIGHT   = 8;
    public static final int NINE    = 9;
    public static final int TEN     = 10;
    public static final int JACK    = 74;
    public static final int QUEEN   = 81;
    public static final int KING    = 75;
    public static final int ACE     = 65;

    private boolean validateSuit(int suit){
        return suit == DIAMONDS || suit == HEARTS || suit == SPADES || suit == CLUBS;
    }

    private boolean validateValue(int value){
        return (value >= TWO && value <= TEN) || value == JACK || value == QUEEN || value == KING || value == ACE;
    }

    public Card(int suit, int value){
        if(validateSuit(suit) && validateValue(value)) {
            this.suit = suit;
            this.value = value;
            this.faceUp = false;
        }
    }

    public int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public void faceDown(){
        faceUp = false;
    }

    public void faceUp(){
        faceUp = true;
    }

    public boolean isFaceUp(){
        return faceUp;
    }

    private void showFaceUp(){
        String[] validSuits = {"H", "D", "C", "S"};
        String suitMask = validSuits[suit -3];

        switch (value){
            case TWO:
                System.out.printf("""
                         -------------\s
                        |2%s           |
                        |   -------   |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |   -------   |
                        |           %s2|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask);
                break;

            case THREE:
                System.out.printf("""
                         -------------\s
                        |3%s           |
                        |   -------   |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |   -------   |
                        |           %s3|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case FOUR:
                System.out.printf("""
                         -------------\s
                        |4%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s4|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case FIVE:
                System.out.printf("""
                         -------------\s
                        |5%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s5|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case SIX:
                System.out.printf("""
                         -------------\s
                        |6%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s6|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case SEVEN:
                System.out.printf("""
                         -------------\s
                        |7%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s7|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case EIGHT:
                System.out.printf("""
                         -------------\s
                        |8%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s8|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case NINE:
                System.out.printf("""
                         -------------\s
                        |9%s           |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |  |   %s   |  |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |           %s9|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case TEN:
                System.out.printf("""
                         -------------\s
                        |10%s          |
                        |   -------   |
                        |  |%s     %s|  |
                        |  |   %s   |  |
                        |  |%s     %s|  |
                        |  |       |  |
                        |  |%s     %s|  |
                        |  |   %s   |  |
                        |  |%s     %s|  |
                        |   -------   |
                        |          %s10|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask, suitMask);
                break;

            case JACK:
                System.out.printf("""
                         -------------\s
                        |J%s           |
                        |   -------   |
                        |  |%s      |  |
                        |  |       |  |
                        |  |       |  |
                        |  |   J   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |      %s|  |
                        |   -------   |
                        |           %sJ|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask);
                break;

            case QUEEN:
                System.out.printf("""
                         -------------\s
                        |Q%s           |
                        |   -------   |
                        |  |%s      |  |
                        |  |       |  |
                        |  |       |  |
                        |  |   Q   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |      %s|  |
                        |   -------   |
                        |           %sQ|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask);
                break;

            case KING:
                System.out.printf("""
                         -------------\s
                        |K%s           |
                        |   -------   |
                        |  |%s      |  |
                        |  |       |  |
                        |  |       |  |
                        |  |   K   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |      %s|  |
                        |   -------   |
                        |           %sK|
                         -------------\s
                        """, suitMask, suitMask, suitMask, suitMask);
                break;

            case ACE:
                System.out.printf("""
                         -------------\s
                        |A%s           |
                        |   -------   |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |  |   %s   |  |
                        |  |       |  |
                        |  |       |  |
                        |  |       |  |
                        |   -------   |
                        |           %sA|
                         -------------\s
                        """, suitMask, suitMask, suitMask);
                break;
            }
    }

    private void showFaceDown(){
        System.out.println("""
                 -------------\s
                |* * * * * * *|
                | * * * * * * |
                |* * * * * * *|
                | * * * * * * |
                |* * * * * * *|
                | * * * * * * |
                |* * * * * * *|
                | * * * * * * |
                |* * * * * * *|
                | * * * * * * |
                |* * * * * * *|
                 -------------\s
                """);
    }

    public void show(){
        if(faceUp){
            showFaceUp();
        }else{
            showFaceDown();
        }
    }
}
