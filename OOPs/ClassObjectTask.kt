fun main() {


    var emp=Employee(id=123,name="Likhitha", salary = 40000, days = 2)
    emp.calculatePerDaySalary()
    emp.totalSalaryofMonth()

    println(emp.calculatePerDaySalary())
    println(emp.totalSalaryofMonth())
}
class Employee
{
    var id:Int=0
    var name:String=" "
    var salary:Int=0
    var days:Int
    constructor(id:Int,name:String,salary:Int,days:Int)
    {
        this.id=id
        this.name=name
        this.salary=salary
        this.days=days

    }
    fun calculatePerDaySalary(): Int {
        return salary/30

    }
    fun totalSalaryofMonth(): String {

        return "Salary per Month: ${days*calculatePerDaySalary()}"

    }

}




