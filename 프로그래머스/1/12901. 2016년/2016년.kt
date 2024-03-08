import java.time.LocalDateTime

class Solution {
    fun solution(month: Int, day: Int): String {
        val localDateTime = LocalDateTime.now()
            .withYear(2016)
            .withMonth(month)
            .withDayOfMonth(day)
        return localDateTime.dayOfWeek.name.substring(0, 3)
    }
}