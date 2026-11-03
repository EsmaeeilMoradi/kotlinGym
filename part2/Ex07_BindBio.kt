package part2

fun bindBio(bio: String?) {
    if (bio != null) {
        println("Bio: $bio")
    } else {
        println("Bio: nothing written yet")
    }
}

fun main() {
    bindBio("Loves Kotlin")
    bindBio(null)
}
