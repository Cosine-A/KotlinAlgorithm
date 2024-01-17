class Solution {
    fun solution(numbers: IntArray): Int {
        val originalNumbers = (0..9).toMutableList()
        originalNumbers.removeIf { numbers.contains(it) }
        return originalNumbers.sum()
    }
}