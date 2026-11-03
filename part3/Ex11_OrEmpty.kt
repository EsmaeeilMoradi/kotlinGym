package part3

fun main() {
    val labs: List<String>? = null
    println(labs.orEmpty().ifEmpty { listOf("Coming soon") })
}
