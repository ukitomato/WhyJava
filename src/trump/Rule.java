package trump;

/**
 * Created by yuki on 2016/10/18.
 */
public interface Rule {
    /**
     * @param hand  手札
     * @param table テーブル
     * @return 見使った組み合わせを返す
     */
    public Card[] findCandidate(Hand hand, Table table);
}
