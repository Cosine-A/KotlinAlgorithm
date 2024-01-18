class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd = gcd(n, m)
        val lcm = (n * m) / gcd
        return intArrayOf(gcd, lcm)
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b != 0) gcd(b, a % b) else a
    }
}