package com.axis.productDataBase.service

import com.axis.productDataBase.modal.ProductModel
import com.axis.productDataBase.utility.ProductUtility


class ProductService
{
        var productUtil=ProductUtility()

        fun insertProduct(product:ProductModel){
            var records=productUtil.insertInput(product)
            if (records>0) println("$records rows inserted successfully")
            else println("record not found")
        }

        fun displayAllProducts(){
            productUtil.viewProduct()
        }

        fun updateProduct(id:Int,name:String){
            var records=productUtil.update(id,name)
            if (records>0) println("$records rows updated successfully")
            else println("record not found")
        }

        fun deleteProduct(id:Int){
            var records=productUtil.delete(id)
            if (records>0) println("$records rows deleted successfully")
            else println("record not found")
        }



}