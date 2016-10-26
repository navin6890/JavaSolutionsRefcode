package com.javasolutions.controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.javasolutions.dto.Emi;
import com.javasolutions.dto.LoginDto;
import com.javasolutions.dto.Registration;


@Controller
public class Welcome  {

	@Autowired
	private SessionFactory sessionFactory;
	
	@RequestMapping(value="welcome" ,method=RequestMethod.GET )
	public String start()
	{
		return("Welcome");
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(Model m)
	{
		m.addAttribute("login",new LoginDto());
		return "login";
	}
	
	@RequestMapping(value="addEmi",method=RequestMethod.GET)
	public String addEmi(Model m,HttpServletRequest req)
	{
		Emi emi=new Emi();
		
	req.setAttribute("id", 2);
		m.addAttribute("emi",emi);
		
		return "addEmi";
	}
	@RequestMapping(value="addFees",method=RequestMethod.POST)
	public String addFees(@ModelAttribute("emi") Emi emi,@RequestParam("id")Integer id)
	{
		Registration registration=new Registration();
		registration.setId(id);
		emi.setRegistration(registration);
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		
		s.save(emi);
	
		t.commit();
		
		System.out.println("successfully saved");
		return "kuchnahi";
	}
	@RequestMapping(value="signIn",method=RequestMethod.POST)
	public void signIn(@ModelAttribute("login") LoginDto ld)
	{
		System.out.println("sign In Recieved");
		System.out.println(ld.getId()+" "+ld.getPassword());
		
		
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(ld);
	
		t.commit();
		
		System.out.println("successfully saved");
	}
}
