package lesson03;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;
    private int winCount_ = 0;

    public int showHand() {
        double randomNum = 0;

        int Hand = 0;
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            Hand = STONE;
        } else if (randomNum < 2) {
            Hand = SCISSORS;
        } else if (randomNum < 3) {
            Hand = PAPER;
        }
        return Hand;
    }

    public void notifyResult(boolean result) {
        if (true == result) {
            winCount_ += 1;
        }
    }

    public int getWinCount() {
        return winCount_;
    }

    public String getName() {
        return name_;
    }

    public Player(String name) {
        name_ = name;
    }
}
