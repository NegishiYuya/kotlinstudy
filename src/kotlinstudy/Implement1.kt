package kotlinstudy

/**
 * Interface1,Interface2の実装クラス
 * class クラス名 : Interface名(,Interface名…複数可)で宣言
 */
class Implement1() : Interface1, Interface2 {
    // Interface1で宣言した変数fooのoverride(コンストラクタに定義してもOK)
    override var foo = "impl1"

    // Interface2で宣言した変数priceのoverride(コンストラクタに定義してもOK)
    override var price = 200

    // Interface1で宣言した抽象メソッドprintのoverride
    override fun print() {
        println("override print from Interface1!")
    }

    // Interface1,2で宣言した具象メソッドhogeのoverride
    override fun hoge() {
        // Interface1の具象メソッド呼び出し
        // hogeという具象メソッドがInterface1,2両方あるので、どちらかの指定をして呼び出し
        super<Interface1>.hoge()
        // Interface2の具象メソッド呼び出し
        super<Interface2>.hoge()
        // 独自実装部分
        println("execute hoge from Implement1!")
    }
}