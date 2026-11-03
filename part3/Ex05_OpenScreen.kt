package part3

open class BaseScreen(val name: String) {
    open fun analyticsName(): String = name
}

class InboxScreen : BaseScreen("inbox") {
    override fun analyticsName() = "inbox_v1"
}

fun main() {
    println(BaseScreen("home").analyticsName())
    println(InboxScreen().analyticsName())
}
