package part3

fun main() {
    val raw = listOf("cbc", "fbs", "cbc", "hba1c")
    val forUi = raw
        .map { it.uppercase() }
        .distinct()
        .sorted()
    println(forUi)
}
