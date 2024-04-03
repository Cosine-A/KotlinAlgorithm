class Solution {
    fun solution(s: String): IntArray {
        var count = 0
        var zero = 0
        var text = s
        while (text != "1") {
            val zeroCount = text.count { it == '0' }
            zero += zeroCount
            text = (text.length - zeroCount).toString(2)
            count++
        }
        return intArrayOf(count, zero)
    }
}