class Solution {
    fun solution(phoneNumber: String): String {
        val length = phoneNumber.length
        val star = "*".repeat(length - 4)
        val number = phoneNumber.replaceRange(0..length - 5, "")
        return star + number
    }
}