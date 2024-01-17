class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0
        (left..right).forEach { number ->
            val divisors = findDivisor(number)
            if (divisors.size % 2 == 0) {
                result += number
            } else {
                result -= number
            }
        }
        return result
    }

    fun findDivisor(number: Int): List<Int> {
        val divisors = mutableListOf<Int>()
        (1..number).forEach {
            if (number % it == 0) {
                divisors.add(it)
            }
        }
        return divisors
    }
}