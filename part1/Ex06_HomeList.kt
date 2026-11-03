package part1

fun main() {
    val homeActions = listOf("Messages", "Lessons", "History")
    println("Menu: $homeActions")

    val drafts = mutableListOf("Note 1")
    drafts.add("Note 2")
    println("Drafts: $drafts")
}
