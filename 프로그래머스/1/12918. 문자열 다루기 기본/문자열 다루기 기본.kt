class Solution {
    fun solution(s: String): Boolean {
        val length = s.length
        if (length != 4 && length != 6) return false
        return s.toIntOrNull() != null
    }
}