package AssignmentStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_AnagramDemo2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence 1 :");
		String s1=sc.nextLine();
		System.out.println("Enter the sentence 2 :");
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean results=Arrays.equals(c1,c2);
		if(results==true) {
			System.out.println("This is Anagram");
		}else {
			System.out.println("This is Not Angaram");
		}
	}

}
