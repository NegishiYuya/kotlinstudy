package kotlinstudy

// コンストラクタの引数にvar,valをつけると初期化まで一気にやってくれる
class ConstructorWithVarMember(var name: String, var age: Int) {
    // メソッド
    fun intro() {
        println("名前は $name  年齢は $age です")
    }
}