package com.axis.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.crud.exception.*;
import com.axis.crud.model.Customer;
import com.axis.crud.repository.CustomerRespository;
import com.axis.crud.util.AppConstants;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRespository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		String passwordLength = customer.getPassword();
		
		if (passwordLength.length()<4) {
			throw new InvalidPasswordException(AppConstants.Invalid_Password);
		}
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return this.customerRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.IDNOT_FOUND_MESSAGE));
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		Customer custom=customerRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.IDNOT_FOUND_MESSAGE));
		if(custom.getPassword()==null)
		{
			throw new InvalidPasswordException(AppConstants.Invalid_Password);
		}
		custom.setUsername(custom.getUsername());
		custom.setEmail(custom.getEmail());
		custom.setPassword(custom.getPassword());
		return customerRepository.save(custom);
		
	}

	@Override
	public String deleteCustomerById(int id) {
		// TODO Auto-generated method stub

		Customer custom =customerRepository.findById(id).orElseThrow(()-> new IDNotFoundException(AppConstants.Delete_Message));
		customerRepository.delete(custom);
		return AppConstants.Delete_Message;
		
	}


}