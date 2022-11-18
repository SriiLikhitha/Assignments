fun main() {
    val row=3
    for(i in 1..row)
    {
        for(j in 1..i)
        {
            print("$j ")
        }
        println()
    }
    //alphabets
    var alphabet='A'
    for(i in 1..3)
    {
        for(j in 1..i)
        {
            print("$alphabet ")
        }
        ++alphabet

        println()
    }
    //numbers
    var num='1'
    for(i in 1..3)
    {
        for( j in 1..i)
        {
            print("$num ")
        }
        ++num

        println()
    }
    //square
    for(i in 1..5)
    {
        for(j in 1..5)
        {
            if(i==1||i==5||j==1||j==5)
                print("*")
            else
                print(" ")
        }
        println()
    }
}