package kotlinstudy

object UserObject {
    var name = "なまえ"
    var id = 0
    var age = 30

    fun intro() {
        println("名前は$name idは$id 年齢は $age")
    }
}