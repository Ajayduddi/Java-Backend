package com.example.springmvc.controller;

import com.example.springmvc.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Apply ModelAttribute to the method level it is always call before any request processing
	@ModelAttribute
	public void modelData(Model m){
		m.addAttribute("name", "Ajay");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}

	// here you http servlets to get request and send response it is old and ugly way
//	@RequestMapping("add")
//	public String add(HttpServletRequest req) {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//
//		int num3 = i + j;
//		HttpSession session = req.getSession();
//		session.setAttribute("num3",num3);
//		return "result.jsp";
//	}

	// modern approach get data using spring request techniques and send both data and view.
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("result", i+j);
		return mv;
	}

	// instead of combining the data and view. we separate them the data with Model/ModelMap and view page.
	@RequestMapping("product")
	public String product(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m){
		m.addAttribute("result", i * j);
		return "result";
	}

	//add result attribute to the User Model . Spring automatically parse the request data to the model
	@RequestMapping("user")
	public String user(@ModelAttribute("result") User u){
		return "result";
	}
}
