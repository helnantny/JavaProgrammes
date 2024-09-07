package javalab;
import java.util.Scanner;
  class method {
	void  area(int b,int h)
	{
		System.out.println("area of a rectangle"+b*h);
	}
	void  area(double w,double hr)
	{

		System.out.println("area of a triangle"+0.5*w*hr);
	}
	void  area(float r)
	{
		System.out.println("area of a circle"+3.14*r*r);
	}}
    public class methodoverloading
    {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of the triangle");
		double h=sc.nextDouble();
		System.out.println("enter the base of the triangle");
	    double b=sc.nextDouble();
		System.out.println("enter the breadth of the rectangle");
		int w=sc.nextInt();
		System.out.println("enter the length of the rectangle");
		int hr=sc.nextInt();
		System.out.println("enter the radius of the circle");
		float r=sc.nextFloat();
		method ob=new method();
		ob. area(b,h);
		ob. area(w,hr);
		ob. area(r);
	}
	}
	




