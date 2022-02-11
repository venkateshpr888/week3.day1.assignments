package week3.day1.Assignment;

public class Assignment_4_Students {
	public static void getStudentInfo(int id)
	{
		System.out.println("Student ID = "+id);
		
		}
	public static void getStudentInfo(int id,String name)
	{
		System.out.println("Student ID and NAME = "+id+","+name);
		
		}
	public void getStudentInfo(String email,long phNum)
	{
		System.out.println("Student email and phoneNumber = "+email+","+phNum);
		
		}
public static void main(String[] args) {
	getStudentInfo(5012);
	getStudentInfo(5012,"venkatesh");
	Assignment_4_Students students = new Assignment_4_Students();
	students.getStudentInfo("rvenkates.888@gmail.com",9650392127l);
	
}
}
//Assignment 4:
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
