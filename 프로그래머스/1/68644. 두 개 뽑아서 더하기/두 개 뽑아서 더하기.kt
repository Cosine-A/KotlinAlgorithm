class Solution {
    fun solution(numbers: IntArray): IntArray {
        val set = mutableSetOf<Int>()
        numbers.forEachIndexed { firstIndex, first ->
            numbers.forEachIndexed { secondIndex, second ->
                if (firstIndex != secondIndex) {
                    set.add(first + second)   
                }
            }
        }
        return set.sorted().toIntArray()
    }
}