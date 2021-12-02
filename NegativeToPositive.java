package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		
		int num=-10;
		if(num<0)
		{
			System.out.println(num+" is negative so please make it positive");
			num=num*-1;
			System.out.println(num+" is positive");
		}
		else if(num>0)
		{
			System.out.println(num+" is positive");
		}

	}

}
