package lesson06;

public class Player {
    private Master master_;
    private Table table_;
    private Hand myHand_ = new Hand();
    private String name_;

    public Player(String name, Master master, Table table) {
        this.name_ = name;
        this.master_ = master;
        this.table_ = table;
    }

    public void play(Player nextplayer) {
        Hand nextHand = nextplayer.showHand();
        Card pickedCard = nextHand.pickCard();

        System.out.println(this+":"+nextplayer+"さんから"+pickedCard+"を引きました");

        dealCard(pickedCard);

        if (myHand.getNumberOfCards() == 0) {
            master_.declareWin(this);
        } else {
            System.out.println(this+"残りの手札は"+myHand_+"です");
        }
    }

    public Hand showHan() {
        if (myHand_.getNumberOfCards() == 1) {
            master_.declareWin(this);
        }

        myHand_.shuffle();

        return myHand_;
    }

    public void recieveCard(Card card) {
        dealCard(card);
    }

    private void dealCard(Card card) {
        myHand_.addCard(card);
        Card[] sameCards = myHand_.findSameNumberCard();

        if (sameCards != null) {
            System.out.print(this + " : ");
            table_.disposeCard(sameCards);
        }
    }

    public String toString() {
        return name_;
    }
}