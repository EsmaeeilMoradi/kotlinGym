package part1

fun main() {
    val hasNetwork = true
    val cta = if (hasNetwork) "Continue" else "Offline — try later"
    println(cta)
}
