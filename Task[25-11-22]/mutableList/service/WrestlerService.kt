
import mutableList.wrestler.Wrestler

class WrestlerService
{

    var wrestlerUtil=WrestlerUtil()
    fun addWrestler(wrestler: Wrestler):String
    {
        wrestlerUtil.wrestlerList().add(wrestler)
        return "Wrestler added"
    }
    fun DisplayAll(wrestler:Wrestler): String {

       println("========Wrestlers Info=======")

        println("Name:${wrestler.Name}")
        println("Age:${wrestler.Age}")
        println("Height:${wrestler.Height}")
        println("Weight:${wrestler.Weight}")
        return "Wrestlers Data"

    }
    fun countOFWrestlerwhoseAge(wrestler: Wrestler):String{
        println("======Age is greater than 35======")
        if(wrestler.Age>35)
        {
            println("Name:${wrestler.Name}")
            println("Age:${wrestler.Age}")
            println("Height:${wrestler.Height}")
            println("Weight:${wrestler.Weight}")
        }
        return "Wrestlers Data"
    }


    fun weightGraterthan200(wrestler: Wrestler):String
    {
        println("=======Weight is Greater than 200")
        if( wrestler.Weight>200)
        {
            println("Name:${wrestler.Name}")
            println("Age:${wrestler.Age}")
            println("Height:${wrestler.Height}")
            println("Weight:${wrestler.Weight}")
        }
        return "Wrestlers Data"
    }

}