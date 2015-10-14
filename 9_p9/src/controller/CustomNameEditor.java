package controller;

import java.beans.PropertyEditorSupport;

public class CustomNameEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String studentname) throws IllegalArgumentException {
		if (studentname.startsWith("mr")||studentname.startsWith("ms")) {
			setValue(studentname);
		} else {
			studentname = "ms "+studentname;
			setValue(studentname);
		}
	}

}
