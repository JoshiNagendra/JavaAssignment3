package AssignmentStrings;

import java.util.Scanner;

public class Q4_Panagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String x=sc.nextLine();
		x=x.replace(" ","");
		x=x.toUpperCase();
		char[] y=x.toCharArray();
		int size=y.length;
		int a[]= new int[26];
		int i=0;
		while(i!=size) {
			int index=y[i]-65;
			a[index]=1;
			++i;
		}
		i=0;
	    while(i!=26) {
	    	if(a[i]==1) 
	    	{
	    		++i;
	    	}
	    	else 
	    	{
	    		System.out.println("Not a Panagram");
	    		System.exit(0);
	    	}
	    
		
			
		}
	    System.out.println("Panagram");
		
	}

}
