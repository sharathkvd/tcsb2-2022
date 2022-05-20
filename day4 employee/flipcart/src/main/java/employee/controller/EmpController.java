package employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employee.bean.EmpDetails;
import employee.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	EmpService employeeService;
	
	
    @PostMapping(value="/createemployee")//endpoint
    EmpDetails createProduct(@RequestBody EmpDetails prod) {

    	EmpDetails p = employeeService.addEmpDetails(prod);//calling service from controller

		return p;


}
}