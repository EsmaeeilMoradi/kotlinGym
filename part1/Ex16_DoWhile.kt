package part1

fun main() {
    var readOnce = 0
    do {
        println("Read local settings")
        readOnce++
    } while (readOnce < 1)
}
