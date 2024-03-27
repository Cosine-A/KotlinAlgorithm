class Solution {
    fun solution(s: String): String {
        return s.split(" ").joinToString(" ") {
            val first = it.firstOrNull()?.uppercase() ?: return@joinToString ""
            first + it.lowercase().run { substring(1, length) }
        }
    }
}