package part2

class SyncRequest(val id: String, var status: String) {
    fun markDone() {
        status = "DONE"
    }
}

fun main() {
    val label = "PENDING"
    val retries = 2
    println(label.run { "status=$this retries=$retries" })

    val req = SyncRequest("req_9", "PENDING")
    val summary = with(req) {
        markDone()
        "$id → $status"
    }
    println(summary)
}
