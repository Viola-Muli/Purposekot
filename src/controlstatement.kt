import java.util.Scanner
fun main() {
  var read = Scanner(System.`in`)
    println("Input patient's temperature")
    var temperature = read.nextDouble()

     if(temperature>37) {
     println("High fever")
     }
     else if (temperature < 37){
          println("Low fever")
     }
     else{
      println("Normal temperature")
     }


}