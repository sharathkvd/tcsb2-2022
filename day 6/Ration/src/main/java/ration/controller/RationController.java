package ration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ration.bean.Ration;
import ration.service.RationService;

@RestController
public class RationController {
	@Autowired
	RationService RationService;
	
	
	@PostMapping(value="/hi")
	Ration addRation(@RequestBody Ration ration) {
		
		Ration addration= RationService.createRation(ration);
		
		
		return addration;
	}

}
