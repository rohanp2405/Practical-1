fun main() {
    val numArray = arrayOf(2, 4, 50, 33, 55, 43, 58, 60)
    var largest = numArray[0]

    for (num in numArray) {
        if (largest < num)
            largest = num
    }

    println("Largest element = $largest")
}