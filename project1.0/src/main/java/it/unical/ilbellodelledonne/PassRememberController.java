package it.unical.ilbellodelledonne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PassRememberController {


	@RequestMapping(value="/passRemember",method=RequestMethod.GET)
	public String passRemember(){
		return "passRemember";
	}
}
