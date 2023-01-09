package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	
	public void studentName() {
		
		System.out.println("Student: studentName()");
	}

	public void studentDept() {

		System.out.println("Student: studentDept()");
	}

	public void studentId() {
		System.out.println("Student: studentId()");

	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		College college = new College();
		Department department = new Department();
		System.out.println("");
		
		student.studentName();
		student.studentDept();
		student.studentId();
		System.out.println("");
		
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		department.deptName();
	}

}
