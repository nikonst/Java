package com.nikonst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class VoterController {

	@RequestMapping(value = "/vote", method = RequestMethod.GET)
	   public ModelAndView voter() {
	      Voter voter= new Voter();	  
		  ModelAndView modelAndView = new ModelAndView("vote", "command", voter);
		  return modelAndView;
	   }
	
	
	@RequestMapping(value = "/voters", method = RequestMethod.POST)
	   public String voters(@ModelAttribute("HelloWeb") Voter voter, 
	      ModelMap model) {
	      model.addAttribute("firstname", voter.getName());
	      model.addAttribute("lastname", voter.getSurname());
	      model.addAttribute("favoriteNumber", voter.getVote());
	      return "voters";
	   }
	
	@ModelAttribute("numbersList")
	   public List<String> getNumbersList()
	   {
	      List<String> numbersList = new ArrayList<String>();
	      numbersList.add("Two Sisters - 1");
	      numbersList.add("Two Young Girls - 2");
	      numbersList.add("Woman in Black - 3");
	      return numbersList;
	   }
}
