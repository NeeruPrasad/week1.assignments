package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,30,10,15,15,16,8,9,8};
		
		for(int i=0;i<numbers.length;i++)
		{
			
			int num=numbers[i];
			int count=0;
			
			for(int j=i+1;j<numbers.length;j++)
			{
				
				if(num==numbers[j])
				{
					count++;
					
					
				}
			
			}
			if(count>0)
			{
				System.out.println(num+" is duplicate");
			}
			
			
		}
		

	}

}
