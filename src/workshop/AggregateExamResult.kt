package workshop

/**
 * 試験結果を集計するクラス.
 */
fun main() {
    // 試験結果Listを取得する.
    val examResultList = getExamResultList()

    // groupIdが2の人の名前を標準出力する.
    println("===== groupIdが2の人の名前を標準出力する =====")
    examResultList.filter { it.groupId == 2 }.forEach { println(it.name) }

    // TODO: 数学の点数が40点以上の人数を標準出力してください.
    println("===== 数学の点数が40点以上の人数を標準出力する =====")

    // TODO: 英語の平均点を標準出力してください.
    println("===== 英語の平均点を標準出力する =====")

    // TODO: idの降順でidと名前を標準出力してください.
    println("===== idの降順でidと名前を標準出力を表示する =====")

    // TODO: 2科目の平均点が一番高い人の名前と点数を標準出力してください.
    println("===== 2科目の平均点が一番高い人の名前と点数を標準出力する =====")

    // TODO: groupIdごとの英語の最高得点者の名前を標準出力してください.
    println("===== groupIdごとの英語の最高得点者の名前を標準出力する  =====")

}

/**
 * 試験結果のListを返却する.
 */
fun getExamResultList(): List<ExamResult> {
    // TODO :足りないデータを追加・id=1,2のデータの修正をしてください.
    return listOf(
            ExamResult(id = 1, groupId = 1, name = "太郎", math = 50, english = 90),
            ExamResult(id = 2, groupId = 2, name = "花子", math = 60, english = 30)
    )
}