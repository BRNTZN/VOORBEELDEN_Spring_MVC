package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="DEFAULT") String name, @RequestParam("studentHobby") String hobby) {
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		
		Student s = new Student();
		s.setName(name);
		s.setHobby(hobby);
		
		model.addObject("msg", "Details submitted: "+name+" and " + hobby);
		model.addObject("student", s);
		return model;
	}

}
