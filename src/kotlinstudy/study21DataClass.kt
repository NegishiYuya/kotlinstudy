package kotlinstudy

fun main() {
    // dataclassクラスのインスタンス生成
    var userData = UserData(1, "太郎")

    // プライマリコンストラクタにない変数の代入
    userData.age = 20
    userData.address = "東京都"

    // println(変数) でprintln(変数.toString())が実行される
    // dataclassのtoStringは「クラス名(プライマリコンストラクタで定義された変数がK=Vの形式で出力される)
    println(userData)
    // プライマリコンストラクタに定義されていない変数は下記のように呼び出し
    println(userData.age)

    // dataclassのcomponentNメソッド でプライマリコンストラクタのN番目に定義された変数の呼び出し
    val age = userData.component1()
    val name = userData.component2()

    // dataclassのcopyメソッドでプライマリコンストラクタの値を保持してオブジェクトをコピー
    var copyUserData = userData.copy()
    println(copyUserData)
    println(copyUserData.age)
    println(copyUserData.address)

    // プライマリコンストラクタの一部の値を変更してコピー
    var copyUserData2 = userData.copy(id = 2)
    println(copyUserData2)

    // equalsはプライマリコンストラクタの値同士の比較の結果
    println(" userDateとcopyUserDataのequalsの結果 ${userData == copyUserData}")
    println(" userDateとcopyUserData2のequalsの結果 ${userData == copyUserData2}")
}