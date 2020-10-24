package kotlinstudy

/**
 * ネストクラスを持つクラス.
 */
class Outer(val name: String = "OuterClass") {
    inner class Nested(val name: String = "NestedClass") {
        fun show() {
            println("外側のクラスの変数 ${this@Outer.name}")
            println("内側のクラスの変数 $name")
        }
    }

    fun print() {
        val nested = Nested()
        nested.show()
    }
}