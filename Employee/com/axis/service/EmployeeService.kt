package com.axis.service

import com.axis.database.EmployeeStore
import com.axis.modal.Employee

class EmployeeService
{

    var employeeStore=EmployeeStore()


    fun viewAllEmployees()
    {
        var employees=employeeStore.empData()
        for(employee in employees)
        {
            println("${employee.id} ${employee.name} ${employee.salary} ${employee.dept}  ${employee.age}")
        }
    }
    fun addNewEmployee(employee: Employee):String
    {
        employeeStore.empData().add(employee)
        return "Successfully Added!!"
    }

}