package AssignmentStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_AlphabaticalOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		s1=s1.replace(" ","");
		char c1[]=s1.toCharArray();
		Arrays.sort(c1);
		System.out.println(c1);
	}

}
