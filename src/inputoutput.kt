import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter student name:")
    var name = readln()
    println("The name of the student is $name")

    println("Enter course:")
    var course = readln()
    println("The student studies $course")

    println("Enter student's age:")
    var age = read.nextInt()
    println("The student is $age years old")


}