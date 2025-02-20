public interface IDeck {
    public Card getTop();
    public int size();
    public Card getFrom(int index);
    public void setBottom(Card card);
    public void replace(int index, Card card);
}
