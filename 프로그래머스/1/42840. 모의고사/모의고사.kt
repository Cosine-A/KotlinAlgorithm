class Solution {
    
    fun solution(answers: IntArray): IntArray {
        val firstAnswers = listOf(1, 2, 3, 4, 5)
        val secondAnswers = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        val thirdAnswers = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        val scores = intArrayOf(0, 0, 0)
        answers.indices.forEach { index ->
            if (answers[index] == firstAnswers[index % 5]) scores[0]++
            if (answers[index] == secondAnswers[index % 8]) scores[1]++
            if (answers[index] == thirdAnswers[index % 10]) scores[2]++
        }
        val maxScore = scores[0].coerceAtLeast(scores[1].coerceAtLeast(scores[2]))
        val people = mutableListOf<Int>()
        scores.forEachIndexed { index, score ->
            if (score == maxScore) {
                people.add(index + 1)
            }
        }
        return people.toIntArray()
    }
}