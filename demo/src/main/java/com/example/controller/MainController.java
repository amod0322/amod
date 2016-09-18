package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;

@Controller
public class MainController {

  @RequestMapping("/hello")
  public String option() {
	  System.out.println("IS IN");
	 // model.addAttribute("user",new User());
	  return "option";

  }
  
  @RequestMapping("/userinput")
  public String userInput(Model model) {
	  System.out.println("IS IN");
	  model.addAttribute("user",new User());
	  return "userinput";

  }
  
  @RequestMapping("/delete")
  public String userdelete(Model model) {
	  System.out.println("IS IN");
	  model.addAttribute("user",new User());
	  return "delete";

  }
  
  
  
//  @RequestMapping("/user")
//  public String index(@ModelAttribute User user) {
//	  
//	  
//	  return "result";
//
//  }

}
