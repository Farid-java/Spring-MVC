package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.RegisteredBean;
import service.ServiceClass;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	ServiceClass serviceclass;
	
	@RequestMapping("/")
	public String Home(Model m)
	{
		List<RegisteredBean> fetchall = serviceclass.fetchall();
		m.addAttribute("list", fetchall);
		return "Home" ;
	}
	
	//method for inserting object to data base
	@RequestMapping("/registered")
	public String registered(@ModelAttribute RegisteredBean registeredBean, @RequestParam("submitButton") String submitButton1,
			@RequestParam("id") int id)
	{ 
		System.out.println(submitButton1);
		if(submitButton1.equals("save")) {
			int insert = serviceclass.insert(registeredBean);
			 if(insert>0)
			 {
				 System.out.println("data inserted");
			 }
		}
		else {
			 System.out.println(id);
				  serviceclass.update(registeredBean);
			}
		
		return "redirect:/" ;
	}
	
	@RequestMapping(value = "/delete/{single}", method = RequestMethod.GET)
	public String delete(	@PathVariable(name="single") int user)
	{
		int delte = serviceclass.delte(user);
		if(delte>0) {
			System.out.println("data inserted");
		}
		
		return "redirect:/";
	}
	
}
