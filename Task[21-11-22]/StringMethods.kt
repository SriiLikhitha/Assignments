fun main() {
    var name="Likhitha"
    var name2="Likki"
    println(name)

    println(name[0])
    println(name[1])
    println("Length of String ${name.length}")
    println("Indices of String ${name.indices}")  //showing the range
    println("Last index of String ${name.lastIndex}") //last index
    println(name.toUpperCase())
    println(name.toLowerCase())
    println(name.indexOf("ik"))
    println(name.equals(name2))
    println(name2.get(2))
    println(name.subSequence(2,6))
    println(name==name2)
}
