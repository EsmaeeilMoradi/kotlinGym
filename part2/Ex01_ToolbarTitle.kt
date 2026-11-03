package part2

fun toolbarTitle(section: String): String = "MyApp · $section"

fun main() {
    println(toolbarTitle("Home"))
    println(toolbarTitle("History"))
}
