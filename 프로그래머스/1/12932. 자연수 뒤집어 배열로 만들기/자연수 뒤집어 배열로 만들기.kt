class Solution {
    fun solution(n: Long): IntArray {
        val answer = mutableListOf<Int>()
        val text = n.toString()
        val length = text.length
        (length - 1 downTo 0).forEach {
            answer.add(text[it].toString().toInt())
        }
        return answer.toIntArray()
    }
}