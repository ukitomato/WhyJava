package fantan;

import trump.Card;
import trump.Hand;
import trump.Rule;
import trump.Table;

public class FantanRule implements Rule {
    @Override
    public Card[] findCandidate(Hand hand, Table table) {
        Card[] candidate = null;

        int numberOfHand = hand.getNumberOfCards();
        for (int position = 0; position < numberOfHand; position++) {
            Card lookingCard = hand.lookCard(position);
            int number = lookingCard.getNumber();
            int suit = lookingCard.getSuit();

            int leftNumber = (number != 1) ? number - 1 : Card.CARD_NUM;
            int rightNumber = (number != Card.CARD_NUM) ? number + 1 : 1;

            if ((true == isThereCard(table, suit, leftNumber) || true == isThereCard(table, suit, rightNumber))) {
                candidate = new Card[1];
                candidate[0] = hand.pickCard(position);
                break;
            }
        }
        return candidate;
    }

    private boolean isThereCard(Table table, int suit, int number) {
        Card[][] cards = table.getCards();
        if (cards[suit - 1][number - 1] != null) {
            return true;
        } else {
            return false;
        }
    }
}
