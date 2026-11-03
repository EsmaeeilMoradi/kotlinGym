package part3.answer

interface ListItem {
    fun title(): String
    fun subtitle(): String
}

class ShopItem(val shopName: String, val distanceKm: Double) : ListItem {
    override fun title() = shopName
    override fun subtitle() = "$distanceKm km"
}

class ArticleItem(val headline: String, val minutes: Int) : ListItem {
    override fun title() = headline
    override fun subtitle() = "$minutes min read"
}

fun bindRow(item: ListItem) {
    println("${item.title()} — ${item.subtitle()}")
}

data class HomeUiState(
    val userTitle: String,
    val banner: String,
    val badgeCount: Int
)

data class UserDto(val name: String?, val city: String?)

sealed class PageState {
    data object Loading : PageState()
    data class Content(val lines: List<String>) : PageState()
    data class Error(val message: String) : PageState()
}

fun homeTitle(dto: UserDto?): String =
    dto?.name?.takeIf { it.isNotEmpty() }?.let { "Hi $it" } ?: "Hi Guest"

fun render(state: PageState): String = when (state) {
    PageState.Loading -> "Skeleton…"
    is PageState.Content -> state.lines.joinToString(" | ")
    is PageState.Error -> "Error: ${state.message}"
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
    val state: PageState = PageState.Content(listOf("Lessons", "Messages"))
    println(render(state))

    val ui = buildHomeUi("Esmaeeil")
    println("${ui.userTitle} | ${ui.banner} | badge=${ui.badgeCount}")

    val items: List<ListItem> = listOf(
        ShopItem("North Market", 0.8),
        ArticleItem("Before the trip", 3)
    )
    items.forEach { bindRow(it) }
}
