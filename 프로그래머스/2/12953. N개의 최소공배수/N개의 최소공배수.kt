class Solution {
    fun solution(arr: IntArray): Int {
        var lcm = arr.first()
        (0 until arr.size - 1).forEach {
            lcm = getLCM(lcm, arr[it + 1])
        }
        return lcm
    }

    private fun getLCM(first: Int, second: Int): Int {
        return (first * second) / getGCD(first, second)
    }

    private fun getGCD(first: Int, second: Int): Int {
        return if (second != 0) getGCD(second, first % second) else first
    }
}