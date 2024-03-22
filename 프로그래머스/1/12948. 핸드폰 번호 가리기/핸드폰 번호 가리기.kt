class Solution {
    fun solution(phoneNumber: String): String {
        val length = phoneNumber.length
        val star = "*".repeat(length - 4)
        val number = phoneNumber.slice(length - 4 until length)
        return star + number
    }
}