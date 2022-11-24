package com.axis.productDB

import DBConnection
import java.sql.DriverManager




fun main(args: Array<String>) {

    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")
    val stmt=connection.createStatement()

    //inserting data
    val res = connection.createStatement().executeUpdate("insert into Product values(7,'screenGaurd',40000,2022)")
    if (res > 0) {
        println("successfully inserted record into Product db !!!")
    } else {
        println("Insert Not sucessful!!!")
    }

}