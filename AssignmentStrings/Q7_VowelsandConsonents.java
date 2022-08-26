package AssignmentStrings;

import java.util.Scanner;

public class Q7_VowelsandConsonents {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String  :");
		String s=sc.nextLine();
		s=s.replace(" ","");
		s=s.toLowerCase();
		char c[]= s.toCharArray();
		int constants=0;
		int vowels=0;
		int specialcharacters=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z') {
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
					vowels++;
				}else {
					constants++;
				}
			}else {
				specialcharacters++;
			}
		}
		System.out.println("Number of vowels  :"+vowels);
		System.out.println("Number of consonents :"+constants);
		System.out.println("Number of special characters :"+specialcharacters);
		
	}

}
