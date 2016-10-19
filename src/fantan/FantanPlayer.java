package fantan;

import trump.*;

public class FantanPlayer extends Player {

    private int pass_;

    public FantanPlayer(String name, Master master, Table table, Rule rule) {
        super(name, master, table, rule);
    }

    public void recieveCard(Card card) {
        if (card.getNumber() == 7) {
            System.out.println(name_ + ":" + card + "を置きました");
            table_.putCard(new Card[]{card});
        } else {
            super.recieveCard(card);
        }
    }
    @Override
    public void play(Player nextPlayer) {
        System.out.println(" " + myhand_);
        Card[] candidate = rule_.findCandidate(myhand_, table_);
        if (candidate != null) {
            System.out.println(" " + candidate[0] + "を置きました\n");
            table_.putCard(candidate);

            System.out.println(table_);

            if (myhand_.getNumberOfCards() == 0) {
                master_.declareWin(this);
            }
        } else {
            pass_++;
            ((FantanMaster) master_).pass(this);
            if (pass_ > FantanMaster.PASS_LIMIT) {
                int numberOfHand = myhand_.getNumberOfCards();
                for (int count = 0; count < numberOfHand; count++) {
                    table_.putCard(new Card[]{myhand_.pickCard(0)});
                }
            }
        }
    }

    public int getPass() {
        return pass_;
    }
}
