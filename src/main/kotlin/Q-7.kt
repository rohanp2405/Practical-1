fun main() {
    val number = 6
    val result : Long
    result = factorial(number)
    println("Factorial of $number without using tailrec = $result")
    val number2 = 5
    println("Factorial of $number using tailrec = ${factorial(number)}")
}
fun factorial(n: Int): Long {
    if (n == 1) {
        return n.toLong()
    } else {
        return n*factorial(n - 1)
    }
}
tailrec fun factorial(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial(n-1, run*n)
}