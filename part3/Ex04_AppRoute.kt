package part3

class AppRoute private constructor(val path: String) {
    companion object {
        fun home() = AppRoute("home")
        fun archive() = AppRoute("archive")
        fun service(id: String) = AppRoute("service/$id")
    }
}

fun main() {
    println(AppRoute.service("req_42").path)
}
