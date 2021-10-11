package firstelement;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;


public class FirstElementUsingStream {
	public static void main(String args[])
	{
		ArrayList<Integer> array1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.print(("enter length of string"));
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			int y=sc.nextInt();
			array1.add(y);
		}
		Optional <Integer> a=array1.stream().findFirst();
		System.out.print(a);
		
		}
}
