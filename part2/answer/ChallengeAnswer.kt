package part2.answer

fun String?.orGuest(): String = this?.ifBlank { null } ?: "Guest"

fun List<String>.asSubtitle(): String =
    when {
        isEmpty() -> "Nothing here"
        size == 1 -> first()
        else -> "${first()} and ${size - 1} more"
    }

class ShopCard(val name: String, var isFavorite: Boolean) {
    fun toggleFavorite() {
        isFavorite = !isFavorite
    }
}

fun main() {
    val name: String? = null
    println("Hi ${name.orGuest()}")

    val card = ShopCard("North Market", false).apply { toggleFavorite() }
    println("${card.name} favorite=${card.isFavorite}")

    println(listOf("Kotlin", "UI").asSubtitle())
}
