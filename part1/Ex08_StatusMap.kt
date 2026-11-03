package part1

fun main() {
    val statusText = mapOf(
        "PENDING" to "Queued for sync…",
        "DONE" to "Synced — check History",
        "FAILED" to "Something failed — try again"
    )
    val current = "PENDING"
    println(statusText[current] ?: "Unknown status")
}
