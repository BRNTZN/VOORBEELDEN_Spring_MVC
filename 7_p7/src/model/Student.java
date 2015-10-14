package model;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String name, hobby;
	private long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Adress adres;

	public Adress getAdres() {
		return adres;
	}

	public void setAdres(Adress adres) {
		this.adres = adres;
	}

	public long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
