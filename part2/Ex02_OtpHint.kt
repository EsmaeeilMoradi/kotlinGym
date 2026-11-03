package part2

fun otpHint(secondsLeft: Int, unit: String = "sec"): String {
    return "Enter the code within $secondsLeft $unit"
}

fun main() {
    println(otpHint(90))
    println(otpHint(secondsLeft = 90, unit = "seconds"))
}
