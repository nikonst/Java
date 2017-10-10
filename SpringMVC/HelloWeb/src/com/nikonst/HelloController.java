package com.nikonst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@RequestMapping("/hello")
public class HelloController {

@Controller
@RequestMapping("/home")
public class HomeController {
		@RequestMapping(method = RequestMethod.GET)
		   public String printHello(ModelMap model) {
		      model.addAttribute("message", " ");

		      return "home";
		   }
	}

@Controller
@RequestMapping("/pictures")
public class PicturesController {
		@RequestMapping(method = RequestMethod.GET)
		   public String printHello(ModelMap model) {
		      model.addAttribute("message", " ");

		      return "pictures";
		   }
	}

@Controller
@RequestMapping("/viewresults")
public class ViewResultsController {
		@RequestMapping(method = RequestMethod.GET)
		   public String printHello(ModelMap model) {
		      model.addAttribute("message", " ");

		      return "viewresults";
		   }
	}
}