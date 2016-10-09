package lesson05;

public class Player {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    private String name_;
    private int winCount_ = 0;

    private Tactics tactics_;

    void setTactics(Tactics tactics) {
        tactics_ = tactics;
    }

    int showHand() {
        int Hand = tactics_.readTactics();
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
