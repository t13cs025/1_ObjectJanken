/**
 * オブジェクト指向によるジャンケンプログラム
 */
public class ObjectJanken
{
    public static void main(String[] args)
    {
        // 審判（高橋さん）のインスタンス生成
        Judge takahashi = new Judge();

        // プレイヤー１（山本さん）の生成
        Player yamamoto = new Player("山本さん");

        // プレイヤー２（鈴木さん）の生成
        Player suzuki = new Player("鈴木さん");

        // 村田さんと山田さんをプレイヤーとしてジャンケンを開始する
        takahashi.startJanken(yamamoto, suzuki);
    }
}
