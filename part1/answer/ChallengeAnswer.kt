package part1.answer

fun main() {
    val userName: String = "Esmaeeil"
    var badgeCount = 2

    val actions = mutableListOf("Messages", "Learn")
    actions.add("History")

    val syncStatus = "PENDING"
    val banner = when (syncStatus) {
        "PENDING" -> "Queued for sync…"
        "DONE" -> "Up to date"
        "FAILED" -> "Try again"
        else -> "—"
    }

    println("Hi $userName · badge=$badgeCount · $banner")
    for (action in actions) {
        println("row → $action")
    }
}
