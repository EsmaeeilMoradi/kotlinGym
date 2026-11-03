package part1

fun main() {
    val userId = "u_1001"      // does not change
    var retryCount = 0         // grows on each failure
    retryCount += 1
    println("user=$userId retries=$retryCount")
}
