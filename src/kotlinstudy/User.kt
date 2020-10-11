package kotlinstudy

/**
 * Userクラス(基底クラス classの宣言の前にopenを付与する)
 */
open class User(var name: String) {
    open fun intro() {
        println("継承元のクラスを使った呼び出し。名前は $name ")
    }
}