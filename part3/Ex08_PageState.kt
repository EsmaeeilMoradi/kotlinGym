package part3

sealed class PageState {
    data object Loading : PageState()
    data class Content(val lines: List<String>) : PageState()
    data class Error(val message: String) : PageState()
}

fun render(state: PageState): String = when (state) {
    PageState.Loading -> "Skeleton…"
    is PageState.Content -> state.lines.joinToString(" | ")
    is PageState.Error -> "Error: ${state.message}"
}

fun main() {
    println(render(PageState.Loading))
    println(render(PageState.Content(listOf("Lessons", "Messages"))))
    println(render(PageState.Error("Offline")))
}
