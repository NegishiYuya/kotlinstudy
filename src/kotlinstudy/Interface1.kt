package kotlinstudy

// Interfaceはinterfaceキーワード interface名で宣言する
interface Interface1 {
    // 変数(abstractになるため、初期値の代入は不可。実装側で代入する)
    var foo: String

    // 具象メソッド hoge
    fun hoge() {
        println("execute hoge from Interface1!")
    }

    // 抽象メソッド print
    fun print()
}