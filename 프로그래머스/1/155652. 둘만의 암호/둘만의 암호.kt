class Solution {
    fun solution(input: String, skip: String, jump: Int): String {
        val newChars = ('a'..'z').toMutableList()
        newChars.removeIf { skip.contains(it) }
        var newInput = ""
        input.forEach { char ->
            val newChar = newChars.indexOf(char)
            val newIndex = newChar + jump
            val index = if (newIndex >= newChars.size) {
                // newIndex - newChars.size
                newIndex % newChars.size
            } else {
                newIndex
            }
            newInput += newChars[index]
        }
        return newInput
    }
}