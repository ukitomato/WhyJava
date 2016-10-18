package trump;

public abstract class Player {

    protected String name_;
    protected Table table_;
    protected Hand myhand_ = new Hand();
    protected Master master_;
    protected Rule rule_;

    public Player(String name, Master master, Table table, Rule rule) {
        this.name_ = name;
        this.master_ = master;
        this.table_ = table;
        this.rule_ = rule;
    }

    public abstract void play(Player player);

    public void recieveCard(Card card) {
        myhand_.addCard(card);
    }

    public String toString() {
        return name_;
    }
}
