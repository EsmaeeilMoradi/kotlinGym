package part1

fun main() {
    val status = "DONE"
    val ui = when (status) {
        "PENDING" -> "Syncing…"
        "DONE" -> "Up to date"
        "FAILED" -> "Needs another try"
        else -> "Unknown"
    }
    println(ui)
}
