class Solution {
    fun solution(n: Int): Int {
        val numberMap = mutableMapOf<Int, Int>(0 to 0, 1 to 1)
        (2..n).forEach {
            numberMap[it] = (numberMap[it - 1]!! + numberMap[it - 2]!!) % 1234567
        }
        return numberMap[n]!!
    }
}