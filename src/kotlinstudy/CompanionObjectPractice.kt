package kotlinstudy

class CompanionObjectPractice {
    /**
     * companion objectの宣言
     * Javaでいうところのstatic変数・staticメソッドの役割を果たす
     * クラスにつき1つ生成されるもの
     *
     * 参考)
     * https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/object-declarations.html
     * https://blog.y-yuki.net/entry/2019/06/02/003000
     */
    companion object {
        var text = "create from companion object"
        fun create(): CompanionObjectPractice {
            return CompanionObjectPractice()
        }

        fun toUpperCase(text: String): String {
            return text.toUpperCase()
        }
    }

    // companion object内の変数を使った処理
    fun printCompanionObjectText() {
        println(text)
    }
}