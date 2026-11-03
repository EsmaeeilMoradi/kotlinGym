package part3

class PhoneFieldState {
    var raw: String = ""
        set(value) {
            field = value.filter { it.isDigit() }.take(11)
        }

    val isValid: Boolean
        get() = raw.length == 11
}

fun main() {
    val field = PhoneFieldState()
    field.raw = "09ab12-3456789"
    println("raw=${field.raw} valid=${field.isValid}")
}
