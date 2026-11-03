package part2

fun averageRating(ratings: List<Double>): Double =
    ratings.sum() / ratings.size

fun main() {
    println(averageRating(listOf(4.5, 4.0, 5.0)))
}
