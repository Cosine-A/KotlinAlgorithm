class Solution {
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        val weapons = (1..number).map { 
            getPrimeSize(it)
        }.map {
            if (it > limit) power else it
        }
        return weapons.sumOf { it }
    }
    
    private fun getPrimeSize(value: Int): Int {
        val sqrt = Math.sqrt(value.toDouble()).toInt()
        var primeSize = 0
        (1..sqrt).forEach {
            if (value % it == 0) {
                primeSize++
                if (value / it != it) {
                    primeSize++
                }
            }
        }
        return primeSize
    }
}