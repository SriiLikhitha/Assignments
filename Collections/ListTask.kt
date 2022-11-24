fun main() {

    var JavaBatch= mutableListOf<String>("Anil","Gopal","Ankit","Manish")
    var KotlinBatch= mutableListOf<String>("Ankit","Kumar","Manish","Rahul")
    var list= mutableListOf<String>()
    println("Java Batch list: $JavaBatch")
    println("Kotlin Batch List: $KotlinBatch")
    JavaBatch.addAll(KotlinBatch)
    println("After Combining : $JavaBatch")
    //println("After Removing duplicates: ${JavaBatch.distinct().toMutableList()}")
    for( name in JavaBatch)
    {
        if(list.contains(name)==false)
        {
            list.add(name)
        }
    }
    println("After Removing duplicates: $list")
    list.sort()
    println("After Sorting: $list")


}