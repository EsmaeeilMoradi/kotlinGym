package part3

// Reuse PageState, render, ListItem, buildHomeUi from the lesson.
fun main() {
    val state: PageState = TODO("Content with two lines")
    println(render(state))

    val ui = TODO("buildHomeUi for your name")
    println(ui)

    val items: List<ListItem> = TODO("Shop + Article")
    items.forEach { bindRow(it) }
}
