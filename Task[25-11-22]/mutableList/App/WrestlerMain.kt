import mutableList.wrestler.Wrestler
fun main()
{

    println("=======Wrestler Data=====")
    var wrestler=Wrestler("Akhil",45,6,250)
    var wrestlerService=WrestlerService()


    wrestlerService.DisplayAll(wrestler)
    wrestlerService.countOFWrestlerwhoseAge(wrestler)
    wrestlerService.weightGraterthan200(wrestler)




}