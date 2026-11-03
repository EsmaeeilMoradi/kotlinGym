package part1

fun main() {
    var pendingUploads = 3
    while (pendingUploads > 0) {
        println("Uploading… left=$pendingUploads")
        pendingUploads--
    }
    println("Queue empty")
}
