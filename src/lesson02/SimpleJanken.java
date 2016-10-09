package lesson02;

public class SimpleJanken {
    public static final int STONE = 0;
    public static final int SCISSORS = 1;
    public static final int PAPER = 2;

    public static void main(String[] args) {
        System.out.println("じゃんけん開始");

        for (int cnt = 0; cnt < 3; cnt++) {
            double randomNum = 0;

            int player1Hand = 0;
            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player1Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player1Hand = SCISSORS;
                System.out.print("パー");
            } else if (randomNum < 3) {
                player1Hand = PAPER;
                System.out.print("パー");
            }

            int player2Hand = 0;
            randomNum = Math.random() * 3;
            if (randomNum < 1) {
                player2Hand = STONE;
                System.out.print("グー");
            } else if (randomNum < 2) {
                player2Hand = SCISSORS;
                System.out.print("パー");
            } else if (randomNum < 3) {
                player2Hand = PAPER;
                System.out.print("パー");
            }

            int player1WinCount = 0;
            int player2WinCount = 0;

            if ((player1Hand == STONE && player2Hand == SCISSORS)
                    || (player1Hand == SCISSORS && player2Hand == PAPER)
                    || (player1Hand == PAPER && player2Hand == STONE)) {
                player1WinCount++;
                System.out.println("\nプレイや−2が勝ちました\n");
            } else if ((player1Hand == SCISSORS && player2Hand == STONE)
                    || (player1Hand == PAPER && player2Hand == SCISSORS)
                    || (player1Hand == STONE && player2Hand == PAPER)) {
                player1WinCount++;
                System.out.println("\nプレイや−2が勝ちました\n");
            } else {
                System.out.println("\n引き分けです\n");
            }

            System.out.println("じゃんけん終了\n");

            if (player1WinCount > player2WinCount) {
                System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです\n");
            } else if (player1WinCount < player2WinCount) {
                System.out.println(player1WinCount + "対" + player2WinCount + "でプレイや−2の勝ちです\n");
            } else {
                System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです\n");
            }
        }

    }
}
