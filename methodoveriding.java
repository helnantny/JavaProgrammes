package javalab;
import java.util.Scanner;
class employee{
	double salary,da,hra,salary1;
	employee(double salary,double da,double hra){
		this.salary=salary;
		this.da=da;
		this.hra=hra;
	}
	void display() {
		System.out.println("Employee");
	}
	void calcSalary() {
		salary1=salary+salary*(da/100)+salary*(hra/100);
		System.out.println("gross salary="+salary1);
	}
}
class Engineer extends employee{
	Engineer(double salary,double da,double hra){
		super(salary,da,hra);
	}
	void display() {
		super.display();
		super.calcSalary();
		System.out.println("engineer");
	}
	void calcSalary() {
		System.out.println("Gross salary of the engineer"+salary1*2);
	}
}
public class Overriding {
	public static void main(String args[]) {
		double salary,da,hra;
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the basic salary of the employee");
				salary=sc.nextDouble();
				System.out.println("enter da% of the employee");
				da=sc.nextDouble();
				System.out.println("enter hra% of the employee");
				hra=sc.nextDouble();
				Engineer e=new Engineer(salary,da,hra);
				e.display();
				e.calcSalary();
				sc.close();
				
	}

}
