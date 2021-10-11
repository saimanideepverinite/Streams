package stringmultiplication;
import java.util.*;
public class StringMul {
	public static void main(String args[])
	{
		char a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st integer");
		String s1=sc.nextLine();
		System.out.print("Enter 2nd integer");
		String s2=sc.nextLine();
		char[] ch1 = new char[s1.length()];
		char[] ch2 =new char[s2.length()];
		for(int i=0;i<s1.length();i++)
		{
			ch1[i] = s1.charAt(i);
		}
		for(int j=0;j<s2.length();j++)
		{
			ch2[j] = s2.charAt(j);
		} 
		int total1=0;
		for(int i=0;i<ch1.length;i++)
		{ 
			int temp=ch1[i]-'0';
			total1=total1*10+temp;
			
		}
		int total2=0;
		for(int i=0;i<ch2.length;i++)
		{ 
			int temp2=ch2[i]-'0';
			total2=total2*10+temp2;
			
		}
		int mul=total1*total2;
		char char3[]=new char[100];
		int value1=0;
		int c=0;
		int i=0;
		for(i=0;mul>=1;i++)
			{
				int one=(mul%10);
				char3[i]=(char) ((one)+'0');
				mul=mul/10;
				c++;
			}
		char char4[]=new char[c];
		int p=c-1;
		for(int l=0;l<c;l++)
		{
			char4[l]=char3[p];
			p=p-1;
		}
		String str4=String.valueOf(char4);
		System.out.println(str4);
	}

}
