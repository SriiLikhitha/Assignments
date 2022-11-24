

class Employee1(Id:Int,Name:String,Age:Int,Dept:String,Salary:Int)
{
    var Id:Int=Id
    var Name:String=Name
    var Age:Int=Age
    var Dept:String=Dept
    var Salary:Int=Salary


}

fun main() {

    var emp= mutableListOf<Employee1>()
    emp.add(Employee1(1,"Sri",20,"cse",30000))
    emp.add(Employee1(2,"Likki",21,"cse",40000))
    emp.add(Employee1(3,"Likhitha",20,"ece",35000))
    emp.add(Employee1(4,"Sree",22,"cse",50000))

    for (employee in emp)
    {
        println("${employee.Id} ${employee.Name} ${employee.Age} ${employee.Dept} ${employee.Salary}")
    }

}