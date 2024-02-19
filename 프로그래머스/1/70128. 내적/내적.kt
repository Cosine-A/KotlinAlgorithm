class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        var total = 0
        (0 until a.size).forEach {
            total += a[it] * b[it]
        }
        return total
    }
}