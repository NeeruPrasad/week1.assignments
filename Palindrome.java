package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
			String s1="madam";
		  //System.out.println(s1.length());
		  String rs1="";
		  int j=0;
		  for(int i=s1.length()-1;i>=0;i--)
		  {
			 char  a=s1.charAt(i);
			 rs1=rs1+a;
			  j++;
  
		  }
		  if(rs1.equals(s1))
		  {
			 System.out.println(rs1+" is a palindrome");
		  } 
		 
		
		
	}

}
