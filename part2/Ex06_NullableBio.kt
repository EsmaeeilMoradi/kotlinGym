package part2

fun main() {
    val displayName: String = "Esmaeeil"
    val bio: String? = null
    println(displayName)
    println(bio ?: "(no bio yet)")
}
