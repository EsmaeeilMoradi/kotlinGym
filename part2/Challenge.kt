package part2

fun String?.orGuest(): String = TODO("Guest fallback")

fun List<String>.asSubtitle(): String = TODO("Card subtitle")

class ShopCard(val name: String, var isFavorite: Boolean) {
    fun toggleFavorite() {
        isFavorite = !isFavorite
    }
}

fun main() {
    val name: String? = null
    println("Hi ${name.orGuest()}")

    val card = ShopCard("North Market", false).apply {
        TODO("toggle favorite")
    }
    println("${card.name} favorite=${card.isFavorite}")

    println(listOf("Kotlin", "UI").asSubtitle())
}
