package workshop.oct26

/**
 * 試験結果を集計するクラス.
 */
fun main() {
    // 試験結果Listを取得する.
    val examResultList = getExamResultList()

    // groupIdが2の人の名前を標準出力する.
    println("===== groupIdが2の人の名前を標準出力する =====")
    examResultList.filter { it.groupId == 2 }.forEach { println(it.name) }

    // 数学の点数が40点以上の人数を標準出力する.
    println("===== 数学の点数が40点以上の人数を標準出力する =====")
    println(examResultList.count { it.math >= 40 })

    // 英語の平均点を標準出力する.
    println("===== 英語の平均点を標準出力する =====")
    println(examResultList.map { it.english }.average())

    // idの降順でidと名前を標準出力する.
    println("===== idの降順でidと名前を標準出力を表示する =====")
    examResultList.sortedByDescending { it.id }.forEach {
        println("${it.id}  ${it.name}")
    }

    // 2科目の平均点が一番高い人の名前と点数を標準出力する.
    println("===== 2科目の平均点が一番高い人の名前と点数を標準出力する =====")
    val highestResult = examResultList.maxBy { it.getAverage() }
    println("名前: ${highestResult?.name}, 点数: ${highestResult?.getAverage()}")

    // groupIdごとの英語の最高得点者の名前を標準出力する.
    println("===== groupIdごとの英語の最高得点者の名前を標準出力する  =====")
    examResultList.groupBy { it.groupId }.forEach { (groupId, list) ->
        val examResult = list.maxBy { it.english }
        println("groupIdが $groupId の 英語の最高得点者は ${examResult?.name} さん で 得点は ${examResult?.english}")
    }
}

/**
 * 試験結果のListを返却する.
 */
fun getExamResultList(): List<ExamResult> {
    // データをListに設定して返却する
    return listOf(
            ExamResult(id = 1, groupId = 1, name = "太郎", math = 39, english = 73),
            ExamResult(id = 2, groupId = 2, name = "花子", math = 40, english = 70),
            ExamResult(id = 3, groupId = 2, name = "三郎", math = 41, english = 69),
            ExamResult(id = 4, groupId = 3, name = "四郎", math = 42, english = 68),
            ExamResult(id = 5, groupId = 3, name = "五郎", math = 42, english = 69)
    )
}