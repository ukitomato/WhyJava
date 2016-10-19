package trump;

/**
 * Created by yuki on 2016/10/18.
 */
public interface Table {
    /**
     * カードを置く
     * @param card
     */
    public void putCard(Card[] card);

    /**
     * カードを見る
     *
     * @return テーブルに置かれたカードを返す
     */
    public Card[][] getCards();
}
