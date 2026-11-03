package part1

fun main() {
    val steps = listOf("compile", "dex", "error: resource", "package")
    for (step in steps) {
        println(step)
        if (step.startsWith("error")) {
            println("Stop run — fix this first")
            break
        }
    }
}
