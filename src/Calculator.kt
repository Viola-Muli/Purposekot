import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number:")
    var num1 = read.nextInt()

    println("Enter operation:")
    val operation = read.next()
    println("Enter second number:")
    var num2 = read.nextInt()

    val result = when (operation){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "Invalid operation"
    }
    println("The result is $result")







}