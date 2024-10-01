package Employee;

import java.util.Scanner;

public class Manager extends Employee{
        
	String Department;
		private int productNo1;
		private int productNo2;
		private int productNo3;
	
	public Manager() {

		Department="";
		 productNo1=0;
		productNo2=0;
		productNo3=0;
	}

	@Override
	public void Read() {
		// TODO Auto-generated method stub
		super.Read();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the Department:");
		String Department=sc.next();
		
		try {
			System.out.println("enter the products1:");
			 productNo1=sc.nextInt();
			 
			 System.out.println("enter the products2:");
			 productNo2=sc.nextInt();
			 
			 System.out.println("enter the products3:");
			 productNo3=sc.nextInt();

			 if (productNo1 < 0 || productNo2 < 0 || productNo3 < 0) {
	                throw new IllegalArgumentException("Product numbers must be positive.");
	            }
		}catch(Exception e) {
			System.out.println("erro"+e.getMessage());;
		}
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		super.Print();
		
		   System.out.println("Department: " + Department);
	        System.out.println("Product Number 1: " + productNo1);
	        System.out.println("Product Number 2: " + productNo2);
	        System.out.println("Product Number 3: " + productNo3);
	}

	
	
		
	
}
