package part2

class HomeUiState {
    var title: String = ""
    var subtitle: String = ""
}

fun main() {
    val state = HomeUiState().apply {
        title = "Home"
        subtitle = "Sync queued"
    }
    println("${state.title} — ${state.subtitle}")
}
