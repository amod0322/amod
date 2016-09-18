package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.UserDao;
import com.example.model.User;

@Controller
public class UserController {
	@Autowired
	private UserDao _userDao;

	@RequestMapping("/user")
	public String createUser(String username, String password, @ModelAttribute User user) {
		// User user = new User();
		user.setUsername(username);
		user.setPassword(password);

		_userDao.save(user);

		user.setId(user.getId());

		// return new ModelAndView("forward:/show");
		return "result";

	}
	
	
	@RequestMapping(value="/deleteid")
	  @ResponseBody
	  public String delete(long id) {
	    try {
	      User user = new User(id);
	      _userDao.delete(user);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "User succesfully deleted!";
	  }

	// @RequestMapping("/show")
	// public String saveSubmit(@ModelAttribute User user) {
	// return "result";
	// }

}
