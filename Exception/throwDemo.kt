import java.lang.Exception

fun main() {

    try {
        checkAgeEligibility(3)
    }catch (e:Exception)
    {
        println(e.message)
    }

}
fun checkAgeEligibility(age:Int)
{
    if(age>=18)
        println("You are eligible")
    else
        throw Exception("You are not eligible")
}