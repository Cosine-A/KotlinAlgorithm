data class Date(
    val year: Int,
    val month: Int,
    val day: Int
) {

    companion object {
        fun from(dateText: String): Date {
            val dateSplit = dateText.split(".").map(String::toInt)
            return Date(dateSplit[0], dateSplit[1], dateSplit[2])
        }
    }
    
    fun toDay(): Int {
        return (year * 12 * 28) + (month * 28) + day
    }
}

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val todayDate = Date.from(today)

        val termMap = mutableMapOf<String, Int>()
        terms.forEach { term ->
            val split = term.split(" ")
            termMap[split[0]] = split[1].toInt()
        }

        val privacieMap = mutableListOf<Pair<Date, String>>()
        privacies.forEach { privacie ->
            val split = privacie.split(" ")
            val date = Date.from(split[0])
            privacieMap.add(date to split[1])
        }

        val answers = mutableListOf<Int>()
        var index = 1
        privacieMap.forEach { (date, term) ->
            val period = termMap[term] ?: return@forEach
            var plusYear = 0
            val months = date.month + period
            var leftMonth = months
            if (months > 12) {
                val monthDivisor = months / 12
                plusYear = monthDivisor
                leftMonth %= 12
                if (monthDivisor >= 2 && leftMonth == 0) {
                    plusYear--
                    leftMonth = 12
                }
            }
            val year = date.year + plusYear
            val month = leftMonth
            val day = date.day
            println("period: $period")
            println("plusYear: $plusYear")
            println("leftMonth: $leftMonth")
            println("months: $months")
            println("year: $year")
            println("month: $month")
            println("day: $day")
            println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
            val finalDate = Date(year, month, day)
            if (todayDate.toDay() >= finalDate.toDay()) {
                answers.add(index)
            }
            index++
        }
        return answers.toIntArray()
    }
}