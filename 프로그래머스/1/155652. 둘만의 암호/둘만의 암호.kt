class Solution {
    fun solution(input: String, skip: String, jump: Int): String {
        val newChars = ('a'..'z').filter { !skip.contains(it) }.toList()
        val newCharSize = newChars.size
        var newInput = ""
        input.forEach { char ->
            val newChar = newChars.indexOf(char)
            val newIndex = newChar + jump
            val index = newIndex % newCharSize
            newInput += newChars[index]
        }
        return newInput
    }
}