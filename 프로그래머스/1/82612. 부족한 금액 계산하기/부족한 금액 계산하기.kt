class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        // 등차수열 공식
        val price2 = price.toDouble()
        val count2 = count.toDouble()
        val finalPrice = (count2 * (2 * price2 + ((count2 - 1) * price2))) / 2
        val needPrice = finalPrice - money
        return if (needPrice > 0L) needPrice.toLong() else 0L
    }
}