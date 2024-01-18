class Solution {
    fun solution(s: String, n: Int): String {
        var password = ""
        for (char in s) {
            if (char.isWhitespace()) {
                password += ' '
                continue
            }
            val newChar = char + n
            val index = if (char.isUpperCase() && newChar > 'Z' || char.isLowerCase() && newChar > 'z') 26 else 0
            val finalChar = newChar - index
            password += finalChar
        }
        return password
    }
}