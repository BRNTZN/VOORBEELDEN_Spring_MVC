package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void InitBinder (WebDataBinder binder) {
		binder.setDisallowedFields(new String[] {"studentMobile"});
		SimpleDateFormat format = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
		
		binder.registerCustomEditor(String.class, "studentName", new CustomNameEditor());
	}

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		model.addObject("headerMessage", "HEADERMESSAGE");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects (Model model1) {
		model1.addAttribute("headerMessage", "HEADERMESSAGE2");
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student s, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}

}
