package org.tnsindia.di;

public class Student {
	private String student_Name;
	private int roll_no;
	public void display()
	{
		System.out.println("Name of The Student is :- " +student_Name);
		System.out.println("Roll No. of The Student is :- " +roll_no);
	}
	public Student(String student_Name, int roll_no) {
		super();
		this.student_Name = student_Name;
		this.roll_no = roll_no;
	}
	
	
	/*public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}*/
	

}
