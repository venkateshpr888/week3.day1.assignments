package week3.day1.assignments.org.student;

//import week3.day1.assignments.org.college.College;
import week3.day1.assignments.org.department.Department;

public class Student {
	public static void studentName()
	{
		System.out.println("Student Name is Venkatesh");
		
		}
	public static void studentDept()
	{
		System.out.println("Student Dept is Information Technology");
		
		}
	public static void studentId()
	{
		System.out.println("Student Id is 55052");
		
		}
public static void main(String[] args) {
	
	Department department = new Department();
	studentName();
	studentDept();
	studentId();
	department.deptName();
	department.collegeName();
	department.collegeCode();
	department.collegeRank();
	
}
}


//Assignment2:
//=============
//     Package   :org.college
//     Class     :College
//     Methods   :collegeName(),collegeCode(),collegeRank()
//
//     Package   :org.department
//     Class        :Department
//     Methods   :deptName()
// 
//     Package   :org.student
//     Class        :Student
//     Methods   :studentName(),studentDept(),studentId()
//  
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.
//
