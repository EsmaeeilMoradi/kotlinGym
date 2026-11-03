package part3

data class UserDto(val name: String?, val city: String?)

fun homeTitle(dto: UserDto?): String =
    dto?.name
        ?.trim()
        ?.takeIf { it.isNotEmpty() }
        ?.let { "Hi $it" }
        ?: "Hi Guest"

fun main() {
    println(homeTitle(UserDto("Esmaeeil", "Tehran")))
    println(homeTitle(UserDto(null, "Tehran")))
    println(homeTitle(null))
}
