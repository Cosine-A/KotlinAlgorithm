class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        return cacl2(num)
    }
    
    private fun cacl2(num: Int): Int {
        var count = 0
        var currentNumber = num.toLong()
        while (currentNumber != 1L) {
            if (count >= 500) return -1
            if (currentNumber % 2 == 0L) { // 짝수
                currentNumber /= 2
            } else {
                currentNumber *= 3
                currentNumber += 1
            }
            count++
        }
        return count
    }
    
    private var count = 0
    
    private fun cacl(num: Int): Int {
        count++
        var currentNumber = num
        if (currentNumber % 2 == 0) { // 짝수
            currentNumber /= 2
        } else {
            currentNumber *= 3
            currentNumber += 1
        }
        println(currentNumber)
        if (count >= 500) {
            return -1
        }
        if (currentNumber == 1) {
            return count
        } else {
            return cacl(currentNumber)
        }
        return -1
    }
}