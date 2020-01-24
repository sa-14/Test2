package com.exam.encapsulation;

public class studentDetails extends student{

	public static void main(String[] args) {
		
		
		
		studentDetails s = new studentDetails ();
		s.setName ("bill");
		s.setAge(23);
		s.setdepartment("645");
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getdepartment());

		
		

	}


}
