class Solution {
    
    private val numberSet = mutableSetOf<Int>()
    private val visited = BooleanArray(7)
    
    fun solution(numbers: String): Int {
        var answer = 0
        dfs(numbers, "", 0)
        numberSet.forEach { number ->
            if (isPrime(number)) {
                answer++
            }
        }
        return answer
    }
    
    private fun dfs(numbers: String, text: String, depth: Int) {
        if (depth > numbers.length) return
        (0 until numbers.length).forEach {
            if (!visited[it]) {
                visited[it] = true
                val numberText = text + numbers[it]
                numberSet.add(numberText.toInt())
                dfs(numbers, numberText, depth + 1)
                visited[it] = false
            }
        }
    }
    
    private fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        (2..Math.sqrt(number.toDouble()).toInt()).forEach {
            if (number % it == 0) {
                return false
            }
        }
        return true
    }
}