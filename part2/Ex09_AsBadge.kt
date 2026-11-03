package part2

fun Int.asBadge(): String =
    if (this <= 0) "" else if (this > 9) "9+" else "$this"

fun main() {
    println("empty='" + 0.asBadge() + "'")
    println(3.asBadge())
    println(12.asBadge())
}
