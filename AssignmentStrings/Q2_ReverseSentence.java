package AssignmentStrings;

public class Q2_ReverseSentence {
	public static void main(String[] args) {
		String s1="Think Twice";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) 
		{
			s2=s2+s1.charAt(i);
		}
		
		s2=s2.toLowerCase();
		String s3="";
		
		String arr[]=s2.split(" ");
		for(int i=arr.length-1;i>=0;i--) 
		{
			s3=s3+arr[i]+" ";
		}
		System.out.println(s3);
		
	}

}
