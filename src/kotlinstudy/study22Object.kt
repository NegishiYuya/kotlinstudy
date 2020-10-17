package kotlinstudy

/**
 * Object宣言に関するサンプルコード.
 */
fun main() {
    /**
     *
     * Objectの呼び出し
     * Objectの使いどころ…singletonなオブジェクトの生成
     * 参考)
     * https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/object-declarations.html
     * https://www.techscore.com/tech/DesignPattern/Singleton.html/
     */
    UserObject.intro()
    UserObject.age = 21
    UserObject.intro()

    // 既存クラスを継承したobjectの呼び出し
    InheritUserObject.intro()
    InheritUserObject.name = "変更された名前"
    InheritUserObject.intro()
}