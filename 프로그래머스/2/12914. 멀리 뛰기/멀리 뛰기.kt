class Solution {
    fun solution(n: Int): Long {
        val list = mutableListOf<Long>(0, 1, 2)
        (3..n).forEach {
            val value = (list[it - 1] + list[it - 2]) % 1234567
            list.add(value)
        }
        return list[n]
    }
}