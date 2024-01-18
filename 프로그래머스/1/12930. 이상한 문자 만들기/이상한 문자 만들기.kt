class Solution {
    fun solution(input: String): String {
        return input.split(" ").map { str ->
            str.mapIndexed { index, char ->
                if (index % 2 == 0) {
                    char.uppercase()
                } else {
                    char.lowercase()
                }
            }.joinToString("")
        }.joinToString(" ")
    }
}