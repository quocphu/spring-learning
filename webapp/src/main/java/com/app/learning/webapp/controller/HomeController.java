package com.app.learning.webapp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.app.learning.common.entity.Student;

@Controller
public class HomeController {

	@RequestMapping(value = "home")
	public String home(@RequestHeader("access_key") String accesKey) {
		System.out.println("accesKey: " + accesKey);
		return "test";
	}

	@RequestMapping(value = "student1", method = RequestMethod.GET)
	public ModelAndView student1(Model model) {
		System.out.println("student1");

		Student st = new Student();
		st.setName("John");
		st.setAge(30);
		st.setImage("john.jpg");
		model.addAttribute(st);

		return new ModelAndView("student1", "command", st);
	}

	@RequestMapping(value = "student1", method = RequestMethod.POST)
	public ModelAndView student1Post(
			Model model,
			@Valid @ModelAttribute Student student, 
			BindingResult result,
			@RequestParam(value = "avatar", required = false) MultipartFile image) {

		System.out.println("student1Post: " + student.toString());
		// System.out.println("image: " + image.getName());

		return new ModelAndView("student1", "command", student);
	}

}
