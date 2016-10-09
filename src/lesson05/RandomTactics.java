package lesson05;

public class RandomTactics implements Tactics {
    public int readTactics() {
        double randomNum = 0;

        int Hand = 0;
        randomNum = Math.random() * 3;
        if (randomNum < 1) {
            Hand = Player.STONE;
        } else if (randomNum < 2) {
            Hand = Player.SCISSORS;
        } else if (randomNum < 3) {
            Hand = Player.PAPER;
        }
        return Hand;
    }
}

