package unchecked;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter integer1 and integer2 values");
		int integer1=sc.nextInt();
		int integer2=sc.nextInt();
		sc.close();
		System.out.print(integer1/integer2);
	}

}
