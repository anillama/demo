package com.bank.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.admin.controller.vo.Dog;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v10")
public class BankingController {
	
	
	@GetMapping("/dogs/{did}")
	public Dog getDog(@PathVariable int did){
		Dog dog=new Dog("tommy","white",2);
		dog.setDid(did);
		return dog;
	}
	
	@GetMapping("/dogs")
	public List<Dog> findDog(){
		Dog dog=new Dog("tommy","white",2);
		dog.setDid(45);
		
		Dog dog01=new Dog("Tiger","Brown",21);
		dog.setDid(55);
		
		Dog dog02=new Dog("Rocky","Blue",1);
		dog.setDid(65);
		
		List<Dog> allDogs = new ArrayList<Dog>();
		allDogs.add(dog02);
		return allDogs;
		
	}

}
