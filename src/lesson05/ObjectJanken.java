package lesson05;
public class ObjectJanken {
    public static void main(String[] args) {
        Judge judge = new Judge();
        Player murata=new Player("村田さん");
        Tactics murataTactics = new AskTactics();
        murata.setTactics(murataTactics);
        Player yamada = new Player("山田さん");
        Tactics yamadaTactics = new RandomTactics();
        yamada.setTactics(yamadaTactics);
        judge.startJanken(murata, yamada);
    }
}
