package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.RegisterBean;
import service.Service1;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Service1 service1;
	@Autowired
	RegisterBean registerBean;
	
	ModelAndView mv;
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}

	@RequestMapping("/register")
public ModelAndView registered(@ModelAttribute("user") RegisterBean user)
{
		System.out.println(user);
		if(user.getPassword() !=null) {
	   mv=new ModelAndView();
		mv.setViewName("home");
		service1.insert(user); 
		 
		}
		List<RegisterBean> f= service1.fetchall();
		
		mv.addObject("list", f);
		
		mv.setViewName("home");
		
	return mv;
}
	@RequestMapping("/delete/{u}")
	public String delete(@PathVariable(name="u") int user)
	{
		registerBean.setId(user);
		System.out.println(user);
		service1.del(registerBean);
		return "redirect:/register";
	}
	
	@RequestMapping("/update/{u}")
	public String update(@PathVariable(name="u") int user,Model m)
	{
		System.out.println(user);
		 RegisterBean bean = service1.serviceUpdate(user);
		 m.addAttribute("BeanObject", bean);
		 
		return "update";
	}
}
