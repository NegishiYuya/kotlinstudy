package kotlinstudy

interface Interface2 {
    // 具象メソッドhoge
    fun hoge() {
        println("execute hoge from Interface2!")
    }

    // 変数(abstractになるため、初期値の代入は不可。実装側で代入する)
    var price: Int

    // 変数(Getterありパターン)
    val taxIncludedPrice: Int
        // Getter,Setterではバッキングフィールドの使用は不可
        // そのため、Getterは他の変数を返却するような作りにしないといけない
        get() = (this.price * 1.1).toInt()

    // 上記の変数を使った具象メソッド
    fun checkPrice() {
        println("値段は $taxIncludedPrice です")
    }
}