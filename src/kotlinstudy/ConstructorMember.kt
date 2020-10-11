package kotlinstudy

// コンストラクタ付きのクラス (クラス名の後のカッコはコンストラクタとしてとる引数　デフォルト値の設定もできる)
class ConstructorMember(name: String, age: Int) {
    // セカンダリコンストラクタ…引数の値がプライマリコンストラクタと異なる場合(最終的にはプライマリコンストラクタを呼ぶ必要あり)
    constructor(name: String) : this(name, 5) {
        println("年齢はデフォルト")
    }

    constructor() : this("デフォルト名前") {
        println("名前はデフォルト")
    }

    var name: String = "名前"
    var age: Int = 10

    init {
        this.name = name
        this.age = age
    }

    // メソッド
    fun intro() {
        println("名前は $name  年齢は $age です")
    }
}