package part2

fun main() {
    val cache = mutableListOf("Inbox")
        .also { println("Log: caching $it") }
    cache.add("Saved")
    println(cache)
}
