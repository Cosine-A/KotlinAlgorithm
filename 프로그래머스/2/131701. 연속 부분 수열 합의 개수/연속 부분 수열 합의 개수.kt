class Solution {
    fun solution(elements: IntArray): Int {
        val elementSize = elements.size
        val answer = mutableSetOf<Int>()
        (1..elementSize).forEach { length ->
            val set = mutableSetOf<Int>()
            repeat(elementSize) { elementIndex ->
                var sum = 0
                repeat(length) { lengthIndex ->
                    sum += elements[(elementIndex + lengthIndex) % elementSize]
                }
                set.add(sum)
            }
            answer.addAll(set)
        }
        return answer.size
    }
}