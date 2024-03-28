data class Report(
    val reporter: String,
    val reported: String
) {

    companion object {
        // 정적 팩토리
        fun from(text: String): Report {
            val split = text.split(" ")
            return Report(split[0], split[1])
        }
    }
}

class Solution {
    fun solution(id_list: Array<String>, reportPair: Array<String>, k: Int): IntArray {
        val reports = mutableSetOf<Report>()
        reportPair.forEach {
            val report = Report.from(it)
            reports.add(report)
        }
        val reportCountMap = mutableMapOf<String, Int>()
        reports.forEach {
            val reported = it.reported
            val count = (reportCountMap[reported] ?: 0) + 1
            reportCountMap[reported] = count
        }
        val answer = IntArray(id_list.size) { 0 }
        reportCountMap.forEach { (reported, count) ->
            if (count < k) return@forEach
            reports.forEach {
                if (it.reported == reported) {
                    val index = id_list.indexOf(it.reporter)
                    answer[index] += 1
                }
            }
        }
        return answer
    }
}