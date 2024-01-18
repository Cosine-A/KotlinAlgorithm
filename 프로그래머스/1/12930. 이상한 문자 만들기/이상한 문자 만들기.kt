class Solution {
    // 새 코드
    fun solution(input: String): String {
        var newInput = ""
        var index = 0
        for (char in input) {
            if (char.isWhitespace()) {
                index = -1
                newInput += " "
            } else {
                newInput += if (index % 2 == 0) {
                    char.uppercase()
                } else {
                    char.lowercase()
                }
            }
            index++
        }
        return newInput
    }
    /* 이전 코드
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
    */
}
