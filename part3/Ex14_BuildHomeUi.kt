package part3

data class HomeUiState(
    val userTitle: String,
    val banner: String,
    val badgeCount: Int
)

data class UserDto(val name: String?, val city: String?)

sealed class PageState {
    data class Content(val lines: List<String>) : PageState()
}

fun homeTitle(dto: UserDto?): String =
    dto?.name?.takeIf { it.isNotEmpty() }?.let { "Hi $it" } ?: "Hi Guest"

fun render(state: PageState): String = when (state) {
    is PageState.Content -> state.lines.joinToString(" | ")
}

fun buildHomeUi(userName: String?): HomeUiState {
    val title = homeTitle(UserDto(userName, null))
    return HomeUiState(
        userTitle = title,
        banner = render(PageState.Content(listOf("Messages", "History"))),
        badgeCount = 1
    )
}

fun main() {
    val ui = buildHomeUi("Esmaeeil")
    println("${ui.userTitle}")
    println("${ui.banner}")
    println("badge=${ui.badgeCount}")
}
