fun main() {
    val seconds = 61
    println("Был(а) " + agoToText(seconds))
}

fun agoToText(seconds: Int): String {
    return when {
        seconds > 259_200 -> "в сети давно"
        seconds > 172_800 -> "в сети вчера"
        seconds > 86_400 -> "в сети сегодня"
        seconds > 3_600 -> "в сети " + getHour(seconds) + " назад"
        seconds >= 61 -> "в сети " + getMinutes(seconds) + " назад"
        else -> "только что"
    }
}

fun getHour(seconds: Int): String {
    val hour = seconds / 3600
    return hour.toString() + when (hour) {
        1 -> " час"
        2, 3, 4 -> " часа"
        else -> " часов"
    }
}

fun getMinutes(seconds: Int): String {
    val minutes = seconds / 60
    return minutes.toString() + when {
        minutes % 10 == 5 || minutes == 11 -> " минут"
        minutes % 10 == 1 -> " минуту"
        else -> " минуты"
    }
}

