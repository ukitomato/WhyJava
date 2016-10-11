package lesson06;

import java.util.ArrayList;

public class Hand {
    private ArrayList hand_ = new ArrayList();

    public void addCard(Card card) {
        hand_.add(card);
    }

    public Card pickCard() {
        Card pickCard = (Card) hand_.remove(0);
        return pickCard;
    }

    public void shuffle() {
        int number = hand_.size();
        int pos;
        for(int count=0;count<number*2;count++) {
            pos = (int) (Math.random() * number);
            Card pickedCard = (Card) hand_.remove(pos);

            hand_.add(pickedCard);
        }
    }

    public int getNumberOfCards() {
        return hand_.size();
    }

    public Card[] findSameNumberCard() {
        int numberOfCards =hand_.size();
        Card[] sameCaeds = null;

        if (numberOfCards > 0) {

        }
    }
}
