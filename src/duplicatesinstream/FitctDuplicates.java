package duplicatesinstream;
import java.util.stream.Collector;
import java.util.stream.Collectors;import java.util.*;

public class FitctDuplicates {
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
	sc.close();
	Set <Integer> b=array1.stream().filter(i -> Collections.frequency(array1, i) > 1).collect(Collectors.toSet());
	System.out.print(b);
}
}
