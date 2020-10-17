package kotlinstudy

/**
 * アップキャスト・ダウンキャスト・スマートキャストに関するサンプルコード.
 */
fun main() {
    var user: User = InheritUser("太郎", 20)
    // アップキャスト 派生クラス⇒基底クラスへのキャスト
    user.intro()

    // userはUserクラスの変数なので、InheritUserクラスにのみあるintroAge()は実行できない
    // user.introAge() ← コンパイルエラーになる！！

    // ダウンキャスト 基底クラス⇒派生クラス　
    if (user is InheritUser) {
        // スマートキャスト
        user.introAge()
    }

    // 上記のスマートキャストのコードは下記のようにも実装可能
    // 参考: https://www.atmarkit.co.jp/ait/articles/1804/24/news008_3.html
    var user2: User = InheritUser("太郎", 20)
    user2 as InheritUser
    user2.introAge()
}