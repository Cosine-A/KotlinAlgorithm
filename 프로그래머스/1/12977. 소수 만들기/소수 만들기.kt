import kotlin.math.sqrt

class Solution {
    
    fun solution(numbers: IntArray): Int {
        var count = 0
        val size = numbers.size
        (0 until size).forEach { first ->
            (first + 1 until size).forEach { second ->
                (second + 1 until size).forEach { third ->
                    val sum = numbers[first] + numbers[second] + numbers[third]
                    if (isPrime(sum)) {
                        count++
                    }
                }
            }
        }
        return count
    }

    fun isPrime(number: Int): Boolean {
        (2..sqrt(number.toDouble()).toInt()).forEach {
            if (number % it == 0) return false
        }
        return true
    }
}