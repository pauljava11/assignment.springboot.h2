package com.assignment1.springboot.h2.crud;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository refEmployeeRepository;
	
	public Employee createEmployee(Employee refEmployee) {
		return refEmployeeRepository.save(refEmployee);
	}
	
	public Employee updateEmployee(Employee refEmployee) throws DataNotFoundException{
		
		Optional<Employee> refNewEmployee = refEmployeeRepository.findById(refEmployee.getUser_id());
		
		if(!refNewEmployee.isPresent()) {
			throw new DataNotFoundException("Exception...");
		} // end of if
		else {
			Employee refEmployeeNew = refNewEmployee.get();
			refEmployee.setFirst_name(refEmployee.getFirst_name());
			refEmployee.setLast_name(refEmployee.getLast_name());
			refEmployee.setMobile_no(refEmployee.getMobile_no());
			refEmployee.setDepartment(refEmployee.getDepartment());
			refEmployee.setAddress(refEmployee.getAddress());
			return refEmployeeNew;
			
		} // end of else
	} // end of updateEmployee
	
	public void deleteEmployee(int id) throws DataNotFoundException{
		
		Optional<Employee> refNewEmployee = refEmployeeRepository.findById(id);
		
		if(!refNewEmployee.isPresent()) {
			throw new DataNotFoundException("Exception...");
		} // end of if
		else {
			refEmployeeRepository.delete(refNewEmployee.get());
		}
	}
}







