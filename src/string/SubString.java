package string;

import java.util.Scanner;

public class SubString {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s1=sc.nextLine();
		StringBuilder sb = new StringBuilder(s1);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					System.out.println(sb);
			}
		}
		}
		System.out.print(sb);
		System.out.print("The longest SubSting without repeatation of elements is:---"+sb.length());

}
}
