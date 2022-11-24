package com.axis.database

import com.axis.modal.Employee

class EmployeeStore
{

    var employees= mutableListOf<Employee>()
    init {
        employees.add(Employee(1,"Likhitha",120000,"CSE",21))
        employees.add(Employee(2,"Harika",120590,"ECE",25))
        employees.add(Employee(3,"Teja",112200,"CSE",30))

    }
    fun empData():MutableList<Employee>
    {
        return employees
    }

}