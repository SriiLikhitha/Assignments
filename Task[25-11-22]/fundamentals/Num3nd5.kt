fun main() {


    //divisible by 3
    println("Numbers divisible by 3:")
    for(i in 1..100)
    {
        if(i%3==0)
        {
            print("$i ")
        }

    }
    //divisible by 5
    println()
    println("Numbers divisible by 5:")
    for(i in 1..100)
    {
        if(i%5==0)
        {
            print("$i ")
        }
    }
    //divisible by 3 and 5
    println()
    println("Numbers divisible by both 3&5:")
    for(i in 1..100)
    {
        if(i%3==0 && i%5==0)
        {
            print("$i ")
        }
    }

}