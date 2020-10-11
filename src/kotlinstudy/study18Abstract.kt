package kotlinstudy

/**
 * 抽象クラス・メソッドに関するサンプルコード.
 */
fun main() {
    val user: AbsrtactUser = ImplementUser("テスト太郎")
    user.intro()
    val user2: AbsrtactUser = ImplementUser2("テスト太郎")
    user2.intro()
}