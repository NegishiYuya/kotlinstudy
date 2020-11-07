package workshop

/**
 * 試験結果を管理するクラス.
 */
class ExamResult(
        val id: Int,
        val groupId: Int,
        val name: String,
        val math: Int,
        val english: Int
) {
    /**
     * 数学と英語の平均点を返却する.
     */
    fun getAverage(): Int {
        // 平均点の算出
        return (math + english) / 2
    }
}