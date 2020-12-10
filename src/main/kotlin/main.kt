val minute = 60 
val hour = minute * 60
val day = hour * 24

fun main() {
    val timeInSecondAgo = 1200

    println("был(а) " + agoToText(timeInSecondAgo))
}

fun agoToText(timeInSecondAgo: Int) = when {
    (timeInSecondAgo in 1..minute) -> "только что"
    (timeInSecondAgo > minute + 1 && timeInSecondAgo <= hour ) -> (timeInSecondAgo / minute).toString() +" " + minuteToText(timeInSecondAgo / minute) + " назад"
    (timeInSecondAgo > hour +1 && timeInSecondAgo <= day ) -> (timeInSecondAgo / hour).toString() + " " + hourToText(timeInSecondAgo / hour) + " назад"
    (timeInSecondAgo > day +1 && timeInSecondAgo <= day * 2 ) -> "сегодня"
    (timeInSecondAgo > day * 2 +1 && timeInSecondAgo <= day * 3 ) -> "вчера"
    else -> "давно"

}

fun minuteToText(timeInMinute: Int) = when {
    (timeInMinute == 1 || (timeInMinute % 10 == 1 && timeInMinute != 11)) -> "минуту"
    (timeInMinute >= 2 && timeInMinute < 5) -> "минуты"
    else -> "минут"
}

fun hourToText(timeInHour: Int) = when {
    (timeInHour == 1 || (timeInHour % 10 == 1 && timeInHour != 11)) -> "час"
    (timeInHour >= 2 && timeInHour < 5) -> "часа"
    else -> "часов"
}

