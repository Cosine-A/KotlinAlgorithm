class Solution {
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        val weapons = (1..number).map { 
            getDivisorsSize(it)
        }.map {
            if (it > limit) power else it
        }
        return weapons.sumOf { it }
    }
    
    private fun getDivisorsSize(value: Int): Int {
        val sqrt = Math.sqrt(value.toDouble()).toInt()
        var divisorsSize = 0
        (1..sqrt).forEach {
            if (value % it == 0) {
                divisorsSize++
                if (value / it != it) {
                    divisorsSize++
                }
            }
        }
        return divisorsSize
    }
}
