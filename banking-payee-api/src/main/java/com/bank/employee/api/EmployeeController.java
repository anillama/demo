package com.bank.employee.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v11")
@CrossOrigin(origins = "*")
public class EmployeeController {
	
	@GetMapping("/employee")
	public List<EmployeeVO> findemployee(){
		EmployeeVO employee=new EmployeeVO();
		employee.setBalance(343);
		employee.setEmail("anil@hotmail.com");
		employee.setName("Anil");
		employee.setPhone(231-232-1123);
		List<EmployeeVO> allDogs = new ArrayList<EmployeeVO>();
		allDogs.add(employee);
		return allDogs;
	}

}
