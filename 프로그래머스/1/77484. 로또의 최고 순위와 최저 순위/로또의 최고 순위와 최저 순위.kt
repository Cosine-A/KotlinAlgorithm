class Solution {
    
    fun solution(lottos: IntArray, winNumbers: IntArray): IntArray {
        var zero = 0
        var match = 0
        lottos.forEach { lotto ->
            if (lotto in winNumbers) {
                match++
                return@forEach
            }
            if (lotto == 0) {
                zero++
            }
        }
        val maxRank = getRank(match + zero)
        val minRank = getRank(match)
        return intArrayOf(maxRank, minRank)
    }

    private fun getRank(count: Int): Int {
        return 7 - (if (count == 0) 1 else count)
    }
}