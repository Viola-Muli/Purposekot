import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
     println("Enter first number:")
    var num1 = read.nextInt()
    println("Enter second number:")
    var num2 = read.nextInt()
    if(num1 > num2){
        println("$num2 is the smallest number")}

    else if (num1 < num2){
        println("$num1 is the smallest number")}
    else{
        println("Both numbers are equal")
    }






}