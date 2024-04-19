import java.time.Duration
import java.time.LocalTime
import java.util.concurrent.ConcurrentHashMap
import kotlin.math.abs
import kotlin.math.ceil

enum class Status {
    IN, OUT;

    companion object {
        fun of(text: String): Status = valueOf(text.uppercase())
    }
}

data class Record(
    val licensePlate: Int,
    val time: LocalTime,
    val status: Status
)

class Solution {
    fun solution(fees: IntArray, recordTexts: Array<String>): IntArray {
        val defaultMinutes = fees[0]
        val defaultPrice = fees[1]
        val period = fees[2].toDouble()
        val periodPrice = fees[3]

        val records = ConcurrentHashMap.newKeySet<Record>()
        recordTexts.forEach { recordText ->
            val split = recordText.split(" ")
            val timeSplit = split[0].split(":")
            val time = LocalTime.of(timeSplit[0].toInt(), timeSplit[1].toInt())
            val licensePlate = split[1].toInt()
            val status = Status.of(split[2])
            val record = Record(licensePlate, time, status)
            records.add(record)
        }

        val totalTimeMap = mutableMapOf<Int, Int>()
        records.forEach { record ->
            if (record.status == Status.IN) {
                val licensePlate = record.licensePlate
                val outRecord = records.firstOrNull {
                    it.licensePlate == licensePlate && it.status == Status.OUT
                }
                records.remove(record)
                if (outRecord != null) {
                    records.remove(outRecord)   
                }
                val outRecord2 = outRecord ?: Record(licensePlate, LocalTime.of(23, 59), Status.OUT)
                val totalTime = totalTimeMap[licensePlate] ?: 0
                val betweenMinutes = record.time.getBetweenMinutes(outRecord2.time)
                totalTimeMap[licensePlate] = totalTime + betweenMinutes
            }
        }

        val priceMap = mutableMapOf<Int, Int>()
        totalTimeMap.forEach { (licensePlate, minutes) ->
            if (minutes <= defaultMinutes) {
                priceMap[licensePlate] = defaultPrice
            } else {
                val newPrice = defaultPrice + ceil((minutes - defaultMinutes) / period) * periodPrice
                priceMap[licensePlate] = newPrice.toInt()
            }
        }
        return priceMap.toSortedMap(compareBy { it }).values.toIntArray()
    }

    private fun LocalTime.getBetweenMinutes(time: LocalTime): Int {
        return Duration.between(this, time).toMinutes().toInt()
    }
}