package kotlinstudy

/**
 * companion objectに関するサンプルコード.
 */
fun main() {
    // companion objectに宣言したメソッドを使ってインスタンスを生成する
    val companionObjectPractice1: CompanionObjectPractice = CompanionObjectPractice.create()
    val companionObjectPractice2: CompanionObjectPractice = CompanionObjectPractice.create()

    // companion objectに宣言した変数の書き換え
    companionObjectPractice1.printCompanionObjectText()
    companionObjectPractice2.printCompanionObjectText()
    CompanionObjectPractice.text = "aaa"
    // companion objectに宣言した変数をコンソール出力させる -> companionObjectPractice1もcompanionObjectPractice2も同じ結果になる
    companionObjectPractice1.printCompanionObjectText()
    companionObjectPractice2.printCompanionObjectText()

    // companion objectに宣言したメソッドを呼び出し ( Javaのstaticメソッドのような使い方ができる！)
    println(CompanionObjectPractice.toUpperCase("abcd"))
    println(CompanionObjectPractice.toUpperCase("efGh"))
}