package lesson05;

import java.io.*;

class AskTactics implements Tactics {
    public int readTactics() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nじゃんけんの手を入力してください");
        System.out.println("0:グー");
        System.out.println("1:チョキ");
        System.out.println("2:パー\n");
        System.out.println("?");
        int Hand=0;
        while (true) {
            try {
                String inputStr = br.readLine();
                Hand = Integer.parseInt(inputStr);

                if (Hand == Player.STONE || Hand == Player.SCISSORS || Hand == Player.PAPER) {
                    break;
                } else {
                    System.out.println("入力が正しくありません。再度入力してください");
                    System.out.println("?");
                }
            } catch (Exception ex) {
                System.out.println("入力が正しくありません。再度入力してください");
                System.out.println("?");
            }
        }

        return Hand;
    }
}
