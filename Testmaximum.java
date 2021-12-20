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

	public void findfloat(Float X, Float Y, Float Z)
	{
		
		if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
			System.out.println(" First largest float value is: " + X);
		} else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
			System.out.println(" Second largest float value is:" + Y);
		} else
			System.out.println(" Third largest float value is" + Z);
	}

	
	public static void main(String[] args) {
		Testmaximum test = new Testmaximum();
		test.findInteger(5, 10, 15);
                test.findfloat(10.2f, 20.2f, 30.2f);

	}

}
