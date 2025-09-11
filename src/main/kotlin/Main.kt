fun main() {
    val numbers = listOf(1, 2, 4, 7, 13, 9, 23)

    val result = numbers.map { isPrime(it) }

    println("Numbers: $numbers")
    println("Are they prime?: $result")
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}
