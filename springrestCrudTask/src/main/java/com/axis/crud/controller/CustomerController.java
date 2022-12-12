package com.axis.crud.controller;

import  java.lang.String;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.crud.model.Customer;

import com.axis.crud.service.CustomerService;

@RestController
@RequestMapping("/api/v2")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer Acustomer = customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(Acustomer, HttpStatus.OK);
	}

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllProducts(){
		List<Customer>customers=customerService.getAllCustomers();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	@PutMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int id,@RequestBody Customer customer)
	{
		
		Customer Ucustomer= customerService.updateCustomer(id,customer);
		return new ResponseEntity<Customer>(Ucustomer,HttpStatus.OK);
	}
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable int id)
	{
		String Dcustomer= customerService.deleteCustomerById(id);
		return new ResponseEntity<String>(Dcustomer,HttpStatus.OK);
	}
	
	
	

}