package com.github.datatables4j.demo.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.datatables4j.demo.thymeleaf.entity.Person;
import com.github.datatables4j.demo.thymeleaf.service.PersonService;

/**
 * Controller for the basic examples management.
 * 
 * @author Thibault Duchateau
 */
@Controller
public class DemoController {
	
	@Autowired
	private PersonService personCoordinator;
	
	@ModelAttribute("persons")
	public List<Person> populateTable(){
		return personCoordinator.get100();
	}
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
}