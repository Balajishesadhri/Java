package com.example.demo;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Demo2 {
	

	
	
	@GetMapping("/")	
	@ResponseBody
	public String home() {
		return"hi there welcome";
	}
		@GetMapping("/demo")
		public String demo(Model model) {
			model.addAttribute("temp", "Always display this msg");
			model.addAttribute("flag", true);
			var emp = Arrays.asList("kumar","kamal","Balaji");
			model.addAttribute("emp", emp);
			return "demo";
			
		}
	}

