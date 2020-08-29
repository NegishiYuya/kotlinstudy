package kotlinstudy

/**
 * while文のサンプルコード.
 */
fun main() {

    var i = 1
    println("===while文===")
    while (i < 3) {
        println("$i")
        i++
    }

    var j = 2
    println("===do-while文===")
    do {
        println("$j")
        j++
    } while (j < 2)

}