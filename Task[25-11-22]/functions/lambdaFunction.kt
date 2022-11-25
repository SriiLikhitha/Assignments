import java.util.Scanner
fun main() {

    var sc=Scanner(System.`in`)
    println("Enter ur age: ")
    var age=sc.nextInt()
    var myLambda:(Int)->String= { age ->
        if (age < 18)
            "You are Non-Adult"
        else if (age >= 18 && age <= 55)
            "You are Adult"
        else

            "You are senior Citizen"
    }
    println(myLambda(age))


}

