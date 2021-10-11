package lengthinstream;
import java.util.*;

public class LengthOfListInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.print(("enter length of string"));
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
			int y=sc.nextInt();
			array1.add(y);
		}
		long count=array1.stream().count();
		System.out.print("length of list---"+count);

	}

}
