package part1

fun main() {
    val results = listOf("Inbox", "Saved", "Settings")
    for ((index, test) in results.withIndex()) {
        println("row[$index] = $test")
    }
}
