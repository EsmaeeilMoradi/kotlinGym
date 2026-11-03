package part2

fun ctaLabel(city: String?): String =
    city?.let { "Shops in $it" } ?: "Choose a city"

fun main() {
    println(ctaLabel("Tehran"))
    println(ctaLabel(null))
}
