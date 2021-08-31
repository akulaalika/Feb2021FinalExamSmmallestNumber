package exam;

import java.util.Scanner;

public class SmallestArrayNumber {

	public static void main(String[] args) {

		int nthNumber;
		// user enters the nth Number
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your nth number pls?");
		nthNumber = scan.nextInt();

		int[] randomArry = new int[nthNumber];

		for (int i = 0; i < randomArry.length; i++) 
			randomArry[i] = (int) (Math.random() * 1000);

			for (int i1 = 0; i1 < randomArry.length; i1++) 
				System.out.println(randomArry[i1]);
			  int smallestnumber = minNumber(randomArry);

				System.out.println("the smallest number is    " + smallestnumber);

			
		
	}

	public static int minNumber(int[] num) {
		int temp = num[0];
		for (int i = 0; i < num.length; i++) {
			if (temp > num[i]) {
				temp = num[i];
			}
		}
		return temp;
	}

}
