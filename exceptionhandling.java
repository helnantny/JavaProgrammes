package javalab;
import java.util.Scanner;
public class exception {
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int choice;
do {
System.out.println("choose an operation");
System.out.println("1.Arithmetic operation");
System.out.println("2.Array access");
System.out.println("3.exit");
choice=sc.nextInt();
switch(choice) {
case 1:
	try {
		System.out.print("enter numerator");
		int numerator=sc.nextInt();
		System.out.print("enter denominator");
		int denominator=sc.nextInt();
		int result=numerator/denominator;
		System.out.println("result="+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught an exception:"+ e.getMessage());	
	}
		break;
case 2:
	int[] numbers= {1,2,3};
	try {
		System.out.println("enter array index to access:");
		int index=sc.nextInt();
		System.out.println("element at index"+index+":"+numbers[index]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("caught an exception"+e.getMessage());
	}
	break;
case 3:
	System.out.println("EXITING");
	default:
	System.out.println("invalid choice please select 1 or 2");
	break;
	}}
while(choice!=3);
sc.close();

	}
}

