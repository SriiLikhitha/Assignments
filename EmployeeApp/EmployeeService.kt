
//in service class we write business logic
class EmployeeService
{
    fun displayEmployeeDetails(employee: Employee)
    {

        println("=========Employee Info==========")
        println("Id= ${employee.id}")
        println("Name= ${employee.name}")
        println("Salary= ${employee.salary}")
    }
    //to find the salary per day
    fun perDaySalary(employee:Employee):Int
    {
        return employee.salary/30
    }
    fun incrementSalaryByTenPercent(employee: Employee): Double {
        var increment:Double=employee.salary*0.10
        //println("10% salary is $increment")
        return increment+employee.salary
    }
}