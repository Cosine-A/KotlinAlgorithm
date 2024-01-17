class Solution {
    fun solution(t: String, p: String): Int {
        val length = p.length
        val numbers = mutableListOf<Long>()
        var index = 0
        while (index + length <= t.length) {
            val numberText = t.substring(index until index + length)
            val number = numberText.toLong()
            numbers.add(number)
            index++
        }
        val inputNumber = p.toLong()
        return numbers.count { it <= inputNumber }
    }
}