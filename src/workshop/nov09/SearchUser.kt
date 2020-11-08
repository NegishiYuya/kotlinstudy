package workshop.nov09

/**
 * 会員の検索と照会を行う.
 */
fun main() {
    // 会員情報の全件を取得する
    val allUserList = getAllUserList()

    // 第1問 Listのsizeの取得(仕様：会員のリストの総件数の返却)
    println(" ======【第1問】====== ")
    val userListSize: Int = getUserListSize(userList = allUserList)
    println("会員の総件数は $userListSize です")

    // 第2問 Listから特定の条件に合う要素のみ抽出する(仕様：年齢が30歳以下の会員の返却)
    println(" ======【第2問】====== ")
    val under30: List<User> = filterUserListByAge(userList = allUserList, age = 30)
    println("30歳未満の会員の名前は、")
    under30.forEach { print("${it.name} ") }
    println("です")

    // 第3問 Listから特定の条件に合う要素の件数を取得する(仕様: 性別が女性(genderが2)の会員の件数の取得)
    println(" ======【第3問】====== ")
    val womanUserCount = countUserByGender(userList = allUserList, gender = 2)
    println("女性の会員の件数は $womanUserCount です")

    // 第4問 Listから特定の条件に合う要素を1件抽出する(仕様: 名前が「戸畑次郎」のIDの取得)
    println(" ======【第4問】====== ")
    val name = "戸畑次郎"
    val id: Int? = findIdByName(userList = allUserList, name = name)
    println("$name さんの idは $id です")

    // 第5問 Listの要素の特定のプロパティでグルーピングされたMapを作る(仕様: 年齢ごとの会員リストを作成したい)
    println(" ======【第5問】====== ")
    val userMapGroupByAge: Map<Int, List<User>> = groupByAge(userList = allUserList)
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

/**
 * 引数で渡すリストの件数を返却する.
 */
fun getUserListSize(userList: List<User>): Int {
    // 引数で渡すリストの件数を返却する
    return userList.size
}

/**
 * 第1引数で渡すリストから、第2引数で渡す年齢以下である会員のリストを返却する.
 */
fun filterUserListByAge(userList: List<User>, age: Int): List<User> {
    // 第2引数で渡す年齢以下である会員のリストを返却する
    return userList.filter { it.age < age }
}

/**
 * 第1引数で渡すリストから、第2引数で渡す性別に合う会員の件数を返却する.
 */
fun countUserByGender(userList: List<User>, gender: Int): Int {
    // 第2引数で渡す性別に合う会員の件数を返却する(ただし、filterは使わないこと)
    return userList.count { it.gender == gender }
}

/**
 * 第1引数で渡すリストから、第2引数で渡す名前に合う会員のIDを返却する.
 * 注意事項: 名前に合う会員が見つからなかった場合はnullを返却すること
 */
fun findIdByName(userList: List<User>, name: String): Int? {
    // 条件に合う1件を抽出し、その結果からIDを返却する
    // (ヒント)条件に合う1件が抽出できずnullの可能性もあり
    return userList.find { it.name == name }?.id
}

/**
 * 引数で渡した会員のListを年齢でグルーピングし<br>
 *  Key:年齢, Value: 会員のListの形式のMapで返却する.
 */
fun groupByAge(userList: List<User>): Map<Int, List<User>> {
    // 会員のListを年齢でグルーピングしMapで返却する
    return userList.groupBy { it.age }
}