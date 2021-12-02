package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		String s="welcome to chennai";
		int count=0;
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		//System.out.println(c);
		
		char c1='n';
		
		
		for(int i=0;i<c.length;i++)
		{
		
			if(c[i]==c1)
			{
				count++;
			}
			
		}
		System.out.println(c1+" occurances "+count+" times");
	}

}
