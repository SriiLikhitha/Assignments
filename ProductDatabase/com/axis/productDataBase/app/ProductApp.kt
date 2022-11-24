package com.axis.productDataBase.app
import com.axis.productDataBase.modal.ProductModel
import com.axis.productDataBase.service.ProductService
import java.util.Scanner
fun main(){

    var productService=ProductService()
    var sc  = Scanner(System.`in`)
    println("============================CRUD OPERATIONS============================")
    println("1)Create       2)Display       3)Update        4)Delete        5)Exit")
    println("=======================================================================")
    println("Enter ur choice")
    var choice=sc.nextInt()
    while(choice<6){
        when(choice){
            1->{
                println("enter Product id")
                var id:Int=sc.nextInt()
                println("enter product name")
                var name:String=sc.next()
                println("enter product price")
                var price:Int=sc.nextInt()
                println("enter product model")
                var model:Int =sc.nextInt()

                //object creation
                var product= ProductModel(id,name,price,model)
                //function call to ProductService
                productService.insertProduct(product)

            }

            2->{
                //display all rows
                productService.displayAllProducts()
            }

            3->{
                //update product name
                println("Enter product Id to update product name ")
                var productIdToUpdate:Int=sc.nextInt()

                println("enter updated product name")
                var productNameUpdated=sc.next()

                productService.updateProduct(productIdToUpdate,productNameUpdated)
            }

            4->{
                //delete row
                println("enter product id to delete")
                var productIdToDelete=sc.nextInt()
                productService.deleteProduct(productIdToDelete)

            }

            5->{
                println("Program End")
                System.exit(0)
            }
        }

        println("process completed enter another choice to continue")
        println("=======================================================================")
        println("1)Create       2)Display       3)Update        4)Delete        5)Exit")
        println("=======================================================================")
        

        var choice1=sc.nextInt()
        choice=choice1
    }










}
