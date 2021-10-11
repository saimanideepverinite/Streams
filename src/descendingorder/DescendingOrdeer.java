package descendingorder;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Scanner;

public class DescendingOrdeer {
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
		
		array1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
	}
}