import kotlin.math.sqrt

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val count = brown + yellow
        val sqrt = sqrt(count.toDouble()).toInt()
        (1..sqrt).forEach {
            if (count % it == 0) {
                val horizontal = count / it
                val vertical = it
                if (horizontal >= vertical && 
                    horizontal >= 3 && 
                    vertical >= 3 &&
                    yellow == (horizontal - 2) * (vertical - 2)
                ) {
                    return intArrayOf(horizontal, vertical)
                }
            }
        }
        return intArrayOf()
    }
}