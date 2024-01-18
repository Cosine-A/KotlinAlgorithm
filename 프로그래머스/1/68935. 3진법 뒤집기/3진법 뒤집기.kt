class Solution {
    fun solution(n: Int): Int {
        val changed = n.toString(3)
        val reversed = changed.reversed()
        return reversed.toInt(3)
    }
}