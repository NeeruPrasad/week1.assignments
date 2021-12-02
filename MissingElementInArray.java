package week1.day2;
import java.util.Arrays;

public class MissingElementInArray {
	
	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,7,6,8};
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)//My code
		{
			if(numbers[i]!=i+1)
			{
				System.out.println("Missing number is"+(i+1));
				break;
			}
		}
	
		
		/*for(int i=0;i<numbers.length;i++)//Test leaf pseudo based
		{
			if(numbers[i]!=i+1)
			{
				System.out.println("Missing number is"+(i+1));
				break;
			}
		}*/
	}

}
