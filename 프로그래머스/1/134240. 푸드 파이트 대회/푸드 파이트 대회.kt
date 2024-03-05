class Solution {
    fun solution(foods: IntArray): String {
        var answer: String = ""
        foods.forEachIndexed { index, foodCount ->
            if (index == 0) return@forEachIndexed
            if (foodCount == 1) return@forEachIndexed
            var finalFoodCount = foodCount
            if (foodCount % 2 == 1) {
                finalFoodCount--
            }
            repeat(finalFoodCount / 2) {
                answer += index.toString()
            }
        }
        return answer + "0" + answer.reversed()
    }
}