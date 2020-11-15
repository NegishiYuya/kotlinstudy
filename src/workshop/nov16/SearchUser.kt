package workshop.nov16

/**
 * 【11/9回の復習】会員の検索と照会を行う.
 */
fun main() {
    // 会員情報の全件を取得する
    val allUserList = getAllUserList()

    // 第2問 Listから特定の条件に合う要素のみ抽出する(仕様：年齢が30歳以下の会員の返却)
    println(" ======【第2問】====== ")
    val under30: List<User> = listOf()
    println("30歳未満の会員の名前は、")
    under30.forEach { print("${it.name} ") }
    println("です")

    // 第5問 Listの要素の特定のプロパティでグルーピングされたMapを作る(仕様: 年齢ごとの会員リストを作成したい)
    println(" ======【第5問】====== ")
    val userMapGroupByAge: Map<Int, List<User>> = mapOf()
    // Keyが年齢, Valueが会員のListのMapをループで回す
    userMapGroupByAge.forEach { (age, userList) ->
        // Keyに設定された年齢の出力
        println("$age 歳")
        // Valueに設定された会員のListから1件ずつ名前を出力
        userList.forEach { println(it.name) }
    }
}

/**
 * 登録済みの会員をすべて返却する.
 */
fun getAllUserList(): List<User> {
    return listOf(
            User(id = 1, name = "登戸太郎", age = 29, gender = 1),
            User(id = 2, name = "川崎花子", age = 29, gender = 2),
            User(id = 3, name = "戸畑次郎", age = 30, gender = 1),
            User(id = 4, name = "福岡三郎", age = 31, gender = 1),
            User(id = 5, name = "赤坂理子", age = 31, gender = 2)
    )
}