class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val size = (right - left + 1).toInt()
        val array = IntArray(size)
        (left..right).forEachIndexed { index, number ->
            array[index] = Math.max(number / n, number % n).toInt() + 1
        }
        return array
    }
}