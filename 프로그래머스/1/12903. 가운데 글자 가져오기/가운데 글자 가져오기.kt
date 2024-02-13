class Solution {
    fun solution(s: String): String {
        val length = s.length
        return if (length % 2 == 0) {
            val middleIndex = length / 2
            return "${s[middleIndex - 1]}${s[middleIndex]}"
        } else {
            val middleIndex = (length + 1) / 2
            return s[middleIndex - 1].toString()
        }
    }
}