package in.codersage.eLearning.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.codersage.eLearning.entity.Course;
import in.codersage.eLearning.entity.Employee;
import in.codersage.eLearning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	 @Autowired
	 EmployeeRepository employeeRepository;
    
	 @GetMapping("/employee")
	    public List<Employee> getAll(){
	        return employeeRepository.findAll();
	    }

	    @GetMapping("/employee/{id}")
	    public Optional<Employee> getDetails(@PathVariable Long id){
	        return employeeRepository.findById(id);
	    }

	    @PostMapping("/employee")
	    public Employee saveemp(@RequestBody Employee age){
	        return employeeRepository.save(age);
	    }
	    
	    
}
