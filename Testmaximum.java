package testmaximum;

import java.util.Scanner;

public class Testmaximum {
	static Scanner scan = new Scanner(System.in);

	public void findInteger(Integer X, Integer Y, Integer Z)
	{
		
		if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
			System.out.println(" First largest value is: " + X);
		} else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
			System.out.println(" Second largest value is:" + Y);
		} else
			System.out.println(" Third is largest" + Z);
	}

	
	public static void main(String[] args) {

		test.findInteger(5, 10, 15);

	}

}
