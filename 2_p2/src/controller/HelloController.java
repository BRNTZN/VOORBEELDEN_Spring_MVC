package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController{
	
	//http://localhost:8080/2_p2/greet/welcome/slqdjkf
	@RequestMapping("/welcome/{userName}")
	public ModelAndView helloWorld(@PathVariable("userName") String name){
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hello World");
		model.addObject("name", name);
		
		return model;
	}
	
	//http://localhost:8080/2_p2/greet/himqlksdjf
	@RequestMapping("/hi{a}")
	public ModelAndView hiWorld(){
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hi World");
		
		return model;
	}
	
	//http://localhost:8080/2_p2/greet/hey/haha/blabla
	@RequestMapping("/hey/{first}/{second}")
	public ModelAndView helloMap(@PathVariable Map<String, String> map){
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "Hey");
		model.addObject("name", map.get("first")+map.get("second"));
		
		return model;
	}

}
