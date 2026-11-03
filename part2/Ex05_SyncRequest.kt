package part2

class SyncRequest(val id: String, var status: String) {
    fun markDone() {
        status = "DONE"
    }
}

fun main() {
    val a = SyncRequest("req_1", "PENDING")
    val b = SyncRequest("req_2", "PENDING")
    a.markDone()
    println("${a.id}=${a.status}, ${b.id}=${b.status}")
}
