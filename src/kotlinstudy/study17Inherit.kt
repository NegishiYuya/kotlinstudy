package kotlinstudy

/**
 * 継承に関するサンプルコード
 */
fun main() {
    val user = User("日本太郎")
    user.intro()

    val inheritUser = InheritUser("東京花子", 20)
    inheritUser.intro()
    inheritUser.introAge()

    val subClassUser: User = InheritUser("日本太郎", 20)
    subClassUser.intro()
    // subClassUser.introAge()
    println(subClassUser.name)
    // println(subClassUser.age)
}