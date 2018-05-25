package com.Controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.Service.TestService;


@Controller
@CrossOrigin
public class testController {
	
	@Autowired
	TestService testService;

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	public  void getFormNames(HttpServletRequest request) {
		System.out.println("Hello");
		testService.display();
	}
}
