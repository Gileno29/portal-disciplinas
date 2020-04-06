package com.gildocordeiro.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/professor")
public class ProfessorController {
	
	ModelAndView model;
	
	@GetMapping
	public ModelAndView index() {
		model = new ModelAndView("professor/userPage.html");
		return model;
	}

}
