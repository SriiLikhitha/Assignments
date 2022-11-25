
import mutableList.wrestler.Wrestler

class WrestlerUtil
{
    var wrestler= mutableListOf<Wrestler>()
    fun wrestlerList():MutableList<Wrestler>
    {
        return wrestler
    }
    init {
        wrestler.add(Wrestler("Akhil",25,6,59))
        wrestler.add(Wrestler("Nikhil",27,5,65))
        wrestler.add(Wrestler("Sakhil",29,6,75))
    }

}