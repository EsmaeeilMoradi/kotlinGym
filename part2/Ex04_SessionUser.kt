package part2

class SessionUser(val phoneMasked: String, var hasProfile: Boolean) {
    fun homeGreeting(): String =
        if (hasProfile) "Continue" else "Complete your profile"

    fun markProfileDone() {
        hasProfile = true
    }
}

fun main() {
    val user = SessionUser("09***1234", hasProfile = false)
    println(user.homeGreeting())
    user.markProfileDone()
    println(user.homeGreeting())
}
