package Employee;

import java.util.Scanner;

public class Employee {

	private String Empid;
	private String name;
	private String address;
	public Employee() {
		super();
		Empid = Empid;
		this.name = name;
		this.address = address;
	}
	
	public void Read() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Employee id:");
		String E1=sc.next();
		System.out.println("Employee name:");
		String N1=sc.next();
		System.out.println("Employee address:");
		String A1=sc.next();
		Empid=E1;
		name=N1;
		address=A1;
		
		
	}
	public void Print() {
		System.out.println("empid:"+ Empid+"  ename:"+ name +" address:  "+ address +"//");
	}
	
}
