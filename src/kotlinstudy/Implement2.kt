package kotlinstudy

/**
 * Interface1,Interface2の実装クラス
 * class クラス名(基底クラスのコンストラクタ引数) : 基底クラス名(コンストラクタ引数),Interface名(,Interface名…複数可)で宣言
 */
class Implement2(name: String) : User(name), Interface1 {
    // Interface1で宣言した変数fooのoverride(コンストラクタに定義してもOK)
    override var foo: String = "implement2"

    // Interface1のprint()の実装
    override fun print() {
        println("execute print from $foo ")
    }

    // Userのintroのオーバーライドの実装
    override fun intro() {
        super.intro()
        println("子クラスを使った呼び出し。名前は $name ")
    }
}