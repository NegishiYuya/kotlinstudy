package kotlinstudy

/**
 * 抽象クラスAbsrtactUserの実装クラス.
 */
class ImplementUser2(name: String) : AbsrtactUser(name) {
    // 抽象メソッドの実装
    override fun intro() {
        println("名前は適当")
    }
}
