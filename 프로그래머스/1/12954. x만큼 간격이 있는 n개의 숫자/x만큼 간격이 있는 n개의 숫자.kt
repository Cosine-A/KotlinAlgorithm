class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val longs = mutableListOf<Long>()
        repeat(n) {
            longs.add(x * (it + 1L))
        }
        return longs.toLongArray()
    }
}