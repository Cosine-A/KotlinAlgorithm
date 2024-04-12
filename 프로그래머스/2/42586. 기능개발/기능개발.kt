class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        var beforeDays = mutableListOf<Int>()
        progresses.forEachIndexed { index, progress ->
            val speed = speeds[index]
            val finalProgress = 100 - progress
            var day = finalProgress / speed
            val remain = finalProgress % speed
            if (remain != 0) {
                day++
            }
            println("beforeDays: $beforeDays")
            println("day: $day")
            if (beforeDays.any { it >= day }) {
                val lastIndex = answer.size - 1
                answer[lastIndex] = answer[lastIndex] + 1
            } else {
                answer.add(1)
            }
            println("answer: ${answer.last()}")
            println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
            beforeDays.add(day)
        }
        return answer.toIntArray()
    }
}