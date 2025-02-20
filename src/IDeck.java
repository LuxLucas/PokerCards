public interface IDeck {
    public Card top();
    public int size();
    public Card get(int index);
    public void bottom(Card card);
    public void replace(int index, Card card);
}
