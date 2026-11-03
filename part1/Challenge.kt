package part1

fun main() {
    val userName: String = TODO("Your name")
    var badgeCount = 0

    val actions = mutableListOf("Messages", "Learn")
    // TODO: actions.add("History")

    val syncStatus = "PENDING"
    val banner = when (syncStatus) {
        "PENDING" -> TODO("Pending label")
        "DONE" -> TODO("Done label")
        "FAILED" -> TODO("Failed label")
        else -> "—"
    }

    for (action in actions) {
        TODO("Print each home action row")
    }
}
