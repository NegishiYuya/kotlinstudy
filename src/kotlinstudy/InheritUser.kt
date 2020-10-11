package kotlinstudy

/**
 * User.ktを継承したクラス(サブクラス クラス宣言の後に ":基底クラスのコンストラクタ"を記述すること )
 */
class InheritUser(name: String, var age: Int) : User(name) {
    // オーバーライド
    override fun intro() {
        println("継承を使った呼び出し。名前は $name 年齢は $age ")
        // 親クラスのメソッド呼び出し
        super.intro()
    }

    fun introAge() {
        println("継承先のみにある呼び出し。 $age 歳")
    }
}