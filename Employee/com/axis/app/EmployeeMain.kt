package com.axis.app

import com.axis.modal.Employee
import com.axis.service.EmployeeService

fun main()
{

    var employeeService=EmployeeService()

    //Adding Employee
    var employee=Employee(5,"Ravi",450000,"HR",39)
    employeeService.addNewEmployee(employee)
    employeeService.viewAllEmployees()

}