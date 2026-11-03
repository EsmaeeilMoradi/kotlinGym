package part2

fun main() {
    val serverMessage: String? = "Slot confirmed"
    serverMessage?.let { msg ->
        println("Snackbar: $msg")
    }
}
