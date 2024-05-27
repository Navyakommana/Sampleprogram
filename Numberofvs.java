package Testprog;

public class Numberofvs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is navya";
		
		int len = str.length();
		int count = 0;
		
		for(int i = len-1;i>=0;i--)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i)== 'u')

{
				count++;
	
}
		}
		System.out.println("Number of vowels in given string are :" + count);

	}

}
