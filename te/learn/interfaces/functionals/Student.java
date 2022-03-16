package com.te.learn.interfaces.functionals;

public class Student implements Comparable {
	private int sId;
	private String sName;
	private int sAge;
	private double sPercantage;

	public Student() {
		super();
	}

	public Student(int sId, String sName, int sAge, double sPercantage) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sPercantage = sPercantage;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public double getsPercantage() {
		return sPercantage;
	}

	public void setsPercantage(double sPercantage) {
		this.sPercantage = sPercantage;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sPercantage=" + sPercantage + "]";
	}

	@Override
	public int compareTo(Object O) {
		Student student = (Student) O;
		if (this.sAge < student.sAge)
			return -1;
		else if (this.sAge > student.sAge)
			return 1;

		return 0;
	}

}
