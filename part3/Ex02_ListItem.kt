package part3

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

fun main() {
    bindRow(ShopItem("Health Cafe", 1.2))
    bindRow(ArticleItem("One-day trip checklist", 4))
}
