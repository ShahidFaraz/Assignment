package Assignmen3;
import java.io.*;
import java.util.*;
public class problem3 {

	public static void main(String[] args) {
		String name;
		double salary;
		System.out.println("---------------- Employee Details----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		name =sc.nextLine();
		
		try {
			System.out.println("Enter Salary");
			salary = sc.nextDouble();
			if(salary>80000)
			{
				System.out.println("Salary is greater than 80000");
				throw new Exception();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}

	}

}
