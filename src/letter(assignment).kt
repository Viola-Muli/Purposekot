import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter letter:")
    val vowels = setOf("a", "e", "i", "o", "u")
    val letter = readln()
    if (letter in vowels)
        println("$letter is a vowel")
    else
        println("$letter is a consonant")


//alternatively
    //println("Enter letter:")
    //var cons = read.next().single()
   // if (cons == 'a' || cons == 'e' || cons == 'i' || cons == 'o' || cons == 'u' ||){
        //println("$cons is a vowel")

   // else{
      //  println("$cons is a consonant")
   // }
}


