package week1.day2;

public class ReverseEvenPlaceWords {

	public static void main(String[] args) {
	
		String test="I am a software tester";
		String[] words=test.split(" ");
		String res="";
		for(int i=0;i<words.length;i++)
		{
			
			//System.out.println(words[i]);
			
			if(i%2!=0)
			{
				char[] str=new char[words[i].length()];
				System.out.print(str.length);
				int k=0;
				for(int j=str.length-1;j>=0;j--)
				{
					
				
					str[k]=words[i].charAt(j);
					//System.out.println(str[k]);
					k++;
				}
				
				String s=String.valueOf(str);
				res=res.concat(s+" ");
				
			}
			else if(i%2==0)
			{
				res=res.concat(words[i]+" ");
			}
			
			
		}
		System.out.println("reverse string="+res);
		
	}

}
