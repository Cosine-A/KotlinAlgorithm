class Solution {
    
    private var answer = 0
    
    fun solution(numbers: IntArray, target: Int): Int {
        dfs(numbers, target, 0, 0)
        return answer
    }
    
    private fun dfs(numbers: IntArray, target: Int, depth: Int, sum: Int) {
        if (depth == numbers.size) {
            if (target == sum) answer++
        } else {
            val nextDepth = depth + 1
            val currentNumber = numbers[depth]
            dfs(numbers, target, nextDepth, sum + currentNumber)
            dfs(numbers, target, nextDepth, sum - currentNumber)
        }
    }
}