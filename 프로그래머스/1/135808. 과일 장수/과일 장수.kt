import java.util.Collections

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var scores = score.sortedDescending().toMutableList()
        var answer = 0
        while (scores.size >= m) {
            val box = scores.subList(0, m)
            scores = scores.subList(m, scores.size)
            answer += Collections.min(box) * m
        }
        return answer
    }
}