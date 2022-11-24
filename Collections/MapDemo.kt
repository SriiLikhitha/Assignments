fun main(args: Array<String>) {


    var players= mutableMapOf<String,String>()
    players.put("Dhoni","is WK Batsmen")
    players.put("Sachin"," is  Batsmen")
    players.put("Hardik","is All rounder")
    players.put("Shami"," is Bowler")
    players.put("Dravid"," is Bowler")
    players.put("Dhoni"," is Coach")//override the value
    //players.put("Dhoni","is WK Batsmen")

    println(players)
    println("Size is: ${players.size}")
    println()
    println("Keys: ${players.keys}")
    println()
    println("Value: ${players.values}")
    println()
    println("Both key and Value: ${players.entries}")
    println()
    println(players.get("Dravid"))//by passing key value
    var a=players.get("Dravid")//by passing key value
    println(a)
    println("============================================")
    for(key in players.keys)
    {
        println(key)
    }
    println("============================================")
    for(keyValue in players.entries)
    {
        println(keyValue)
    }

}