package test;

import java.io.*;
@SuppressWarnings("serial")
public class StudentBean implements Serializable {
	private int StudentId,sanskrit,socscience,science,hindi,english,math;
	private String StudentName;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}
	public int getSocscience() {
		return socscience;
	}
	public void setSocscience(int socscience) {
		this.socscience = socscience;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

}
