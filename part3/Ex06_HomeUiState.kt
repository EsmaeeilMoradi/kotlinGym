package part3

data class HomeUiState(
    val userTitle: String,
    val banner: String,
    val badgeCount: Int
)

fun main() {
    val state = HomeUiState("Hi Esmaeeil", "Sync queued", 2)
    val updated = state.copy(badgeCount = 0)
    println(updated)
}
