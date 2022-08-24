import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    print("Num 1 : ")
    var num1 = reader.nextInt()
    print("Num 2 : ")
    var num2 = reader.nextInt()
    print("Num 3 : ")
    var num3 = reader.nextInt()

    var add = num1+num2+num3
    println("Addition = $add")
    var multi = num1*num2*num3
    println("Multiplication = $multi")
    var div = num1/num2
    println("Division = $div")
    var sub = num1-num2-num3
    println("Substraction = $sub")
}