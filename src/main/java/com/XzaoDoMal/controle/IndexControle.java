package com.XzaoDoMal.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexControle {
	
	@GetMapping("/inicio-controle")
	public ModelAndView inicio() {
	    ModelAndView mv = new ModelAndView("index");
	    return mv;
	}
	@GetMapping("/inicio-login")
	public ModelAndView inicioLogin() {
	    ModelAndView mv = new ModelAndView("login");
	    return mv;
	}
}

