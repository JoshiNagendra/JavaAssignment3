package AssignmentStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_AnagramDemo {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First String :");
		String s1=sc.nextLine();
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean results=Arrays.equals(c1,c2);
		if(results==true) 
		{
			System.out.println("This is Anagram");
		}
		else 
		{
			System.out.println("Not Anagram");
		}
	}
}
