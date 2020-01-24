package com.exam.exceptions;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		try {
			int number = scn.nextInt();
			
			if (number == 0)
				throw new ZeroNumberException();
			
			if (number < 0)
				throw new NumberTooSmallException();
			
			if (number > 10000)
				throw new NumberTooLargeException();
			
			
			System.out.println("Allocated memory");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

}