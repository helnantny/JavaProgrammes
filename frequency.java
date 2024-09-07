package javalab;
import java.util.Scanner;
public class Frequency
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	System.out.println("enter a character");
	char str1=sc.nextLine().charAt(0);
	int j=0;
	int len=str.length();
	for(int i=0;i<len;i++)
	{
		if(str.charAt(i)==str1)
			j++;
		
	}

	if(j==0)
	{
	System.out.println("character not found");

}
	else
	{
		System.out.println("character found"+j+"times");
		
	}
}}
