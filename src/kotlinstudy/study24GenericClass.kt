package kotlinstudy

/**
 * ジェネリック型に関するサンプルコード.
 * 参考)
 * https://dogwood008.github.io/kotlin-web-site-ja/docs/reference/generics.html
 * https://qiita.com/watanave/items/d3d5b529b4c66ff3c872
 *
 */
fun main() {
    var genericClassExampleString = GenericClassExample<String>("test")
    println("値:${genericClassExampleString.getPropertyValue()} 型:${genericClassExampleString.value::class}")

    var genericClassExampleInt = GenericClassExample<Int>(1)
    println("値:${genericClassExampleInt.getPropertyValue()} 型:${genericClassExampleInt.value::class}")
    // 下記のコードはエラー
    // genericClassExampleInt.value = "hoge" Int型のみValueとして受け付けるがStringを設定しようとしているため

    // コンストラクタに渡される値によって型が推論される場合は型の指定は不要
    var genericClassExample = GenericClassExample("test")
    println("値:${genericClassExample.getPropertyValue()} 型:${genericClassExample.value::class}")

    // Userクラスもしくはその派生クラスのみ受け付けるジェネリック型の利用
    var genericClassExampleUser = GenericClassExampleWithType<User>(User("太郎"))
    println(genericClassExampleUser.getPropertyValue().name)

    var genericClassExampleInheritUser = GenericClassExampleWithType<InheritUser>(InheritUser("次郎", 30))
    println(genericClassExampleInheritUser.getPropertyValue().name)

    // 下記のコードはエラー
    // var genericClassExampleUser = GenericClassExampleWithType<String>("花子")) GenericClassExampleWithTypeの型の指定に合わない
}