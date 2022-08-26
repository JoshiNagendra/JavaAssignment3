package AssignmentStrings;

import java.util.Scanner;

public class Q8_SpecialCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count special characters  :");
		String s=sc.nextLine();
		s=s.replace(" ","");
		s=s.toLowerCase();
		int count=0;
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z'||c[i]>='0'&&c[i]<='9') {
				
			}else {
				count++;
			}
		}
		System.out.println("Count of special charcters : "+count);
	}

}
