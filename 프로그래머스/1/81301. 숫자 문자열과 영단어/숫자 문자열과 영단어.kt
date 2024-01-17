class Solution {
    fun solution(input: String): Int {
        var finalInput = input
        val numbers = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        numbers.forEachIndexed { index, number ->
            finalInput = finalInput.replace(number, "$index")
        }
        return finalInput.toInt()
    }
}