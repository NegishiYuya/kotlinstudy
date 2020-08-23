package kotlinstudy

/**
 * Nullable型についてのサンプルコード.
 */
fun main() {
    var number1 : Int = 10000
    var number2 : Int = number1
    /** 型名の後に?をつけると、Nullable型になる */
    var number3 : Int? = number1

    // == で同値の確認
    println(number1 == number2)
    println(number1 == number3)
    /**
     *  === で(型まで含めて）同一かどうかの確認ができる.
     *  number1とnumber2は同じ型なのでtrueとなる
     *  number1とnumber3ではnumber1がNull不許容であるのに対して、
     *  number3はNull許容のため別の型として扱われ、falseとなる
     *
     */
    println(number1 === number2)
    println(number1 === number3)
}
