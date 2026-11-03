package part3

object AppConfig {
    const val APP_NAME = "MyApp"
    const val SUPPORT_PHONE = "09000000000"
    fun aboutLine(): String = "$APP_NAME · support $SUPPORT_PHONE"
}

fun main() {
    println(AppConfig.aboutLine())
}
