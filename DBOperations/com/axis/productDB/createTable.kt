package com.axis.productDB

import DBConnection
import java.sql.DriverManager

fun main(args: Array<String>) {



    var dbConnection=DBConnection()
    var connection=dbConnection.connect()
    println("Connection established!!")

    val stmt=connection.createStatement()
    stmt.execute("create table Product(id int,name varchar(50),price int,model int);")
    println("Table Created!!!")

}