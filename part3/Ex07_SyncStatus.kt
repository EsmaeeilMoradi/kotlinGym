package part3

enum class SyncStatus { PENDING, DONE, FAILED }

fun statusColorKey(status: SyncStatus): String = when (status) {
    SyncStatus.PENDING -> "calm_blue"
    SyncStatus.DONE -> "success_green"
    SyncStatus.FAILED -> "warning"
}

fun main() {
    println(statusColorKey(SyncStatus.PENDING))
}
