fun main() {

    //Predefined functions-already exists
    println("eMobilis")

    var squareroot = Math.sqrt(169.0)
    println("The squareroot is $squareroot")

    var round = Math.round(47.57)
    println("Result: $round.0")

    var myceil = Math.ceil(32.34)
    println("Result: $myceil")

month()
multiply()
student("Bernice",18)
student("Adrien",17)
}
//User-defined functions
fun month(){
    println("The month is July")
}
fun multiply(){
    var num1 = 30
    var num2 = 27
    println(num1 * num2)
}
//Parameters and arguments
fun student(name:String,age:Int,){
    println("$name is $age years old")

}