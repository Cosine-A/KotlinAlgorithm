class Solution {
    fun solution(top: Int, scores: IntArray): IntArray {
        val topIndex = top - 1
        val sortedScores = mutableListOf<Int>()
        val tops = mutableListOf<Int>()
        scores.forEachIndexed { index, score ->
            sortedScores.add(score)
            sortedScores.sortDescending()
            val topScore = if (index < topIndex) {
                sortedScores[index]
            } else {
                sortedScores[topIndex]
            }
            tops.add(topScore)
        }
        return tops.toIntArray()
    }
}