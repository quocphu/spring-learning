package com.app.learning.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="{id}")
public class BaseController {
//	@RequestMapping(value="hello")
//	public String hello(@PathVariable String id, Model model) {
//		model.addAttribute("id", id);
//		return "hello";
//	}
//	
//	@RequestMapping(value="aa")
//	@ResponseBody
//	public String aa() {
//		return "hello aa";
//	}
}
