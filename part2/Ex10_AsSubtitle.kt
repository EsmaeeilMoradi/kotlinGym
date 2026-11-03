package part2

fun List<String>.asSubtitle(): String =
    when {
        isEmpty() -> "Nothing here"
        size == 1 -> first()
        else -> "${first()} and ${size - 1} more"
    }

fun main() {
    println(listOf("Kotlin", "Android").asSubtitle())
}
