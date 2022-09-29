package org.college;

public class College {
	public void collegeName() {
		System.out.println("St.Joseph's College Trichy");
	}
	public void collegeCode() {
		System.out.println("College code: 2021");
	}
	public void collegeRank() {
		System.out.println("College Rank : A+");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		Dept d=new Dept();
		d.deptName();
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Hostel h=new Hostel();
		h.hostelName();
	}
}
