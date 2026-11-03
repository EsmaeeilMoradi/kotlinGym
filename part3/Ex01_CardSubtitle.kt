package part3

fun buildCardSubtitle(block: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(block).toString()
}

fun main() {
    val subtitle = buildCardSubtitle {
        append("Deliver today")
        append(" · ")
        append("8–10 AM")
    }
    println(subtitle)
}
