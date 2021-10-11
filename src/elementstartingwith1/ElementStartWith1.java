package elementstartingwith1;
import java.util.*;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ElementStartWith1 {
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
		List<Integer> array2=(List<Integer>)array1.stream()
				.filter(z->z.toString().startsWith("1"))
				.collect(Collectors.toList());
		System.out.print(array2);
	}
}
