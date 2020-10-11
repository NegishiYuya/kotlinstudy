package kotlinstudy

/**
 * クラスに関するサンプルコード.
 */
fun main() {
    // クラスからオブジェクトを生成
    var member = Member()

    // Getter呼び出し
    println(member.name)
    println(member.age)
    println(member.depatmentName)

    // Setter呼び出し
    member.name = "日本太郎";
    member.age = 30
    member.depatmentName = "システム開発";

    // メソッド実行
    member.intro()

    val constructorMember = ConstructorMember("日本太郎", 20)
    constructorMember.intro()

    val constructorWithVarMember = ConstructorWithVarMember("日本花子", 40)
    constructorWithVarMember.intro()

    // セカンダリコンストラクタの動作
    val constructorMemberWithName = ConstructorMember("日本太郎")
    constructorMemberWithName.intro()

    val constructorMemberWithoutName = ConstructorMember()
    constructorMemberWithoutName.intro()
}