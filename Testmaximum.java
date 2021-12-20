package testmaximum;

import java.util.Scanner;

public class Testmaximum <T extends Comparable<T>> {
    T X;
    T Y;
    T Z;
	static Scanner scan = new Scanner(System.in);
	

	public Testmaximum(T X,T Y,T Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
	
	public T max() {
		
    	return Testmaximum.maxmethd(X, Y, Z);
    }

	public void findInteger(Integer X, Integer Y, Integer Z)
	{
		
		if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
			System.out.println(" First largest value is: " + X);
		} else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) 
		{
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

	public void findstring(String X, String Y, String Z) 
	{
		if (X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
			System.out.println(" First String is: " + X);
		} else if (Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) 
		{
			System.out.println(" Second String is:" + Y);
		} else
			System.out.println(" Third String is" + Z);
	}

	
	public <T extends Comparable<T>> void extendmax(T X, T Y, T Z)
	{
        if(X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
            System.out.println(" First is largest "+X);
        }
        else if(Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
            System.out.println(" Second is largest"+Y);
        }
        else
            System.out.println(" Third is largest"+Z);

    }


	    public static <T extends Comparable<T>> T maxmethd(T X, T Y, T Z) {
	        if(X.compareTo(Y) >= 0 && X.compareTo(Z) >= 0) {
	            System.out.println(" First is largest: " +X);
	        }
	        else if(Y.compareTo(X) >= 0 && Y.compareTo(Z) >= 0) {
	            System.out.println(" Second is largest : " +Y);
	        }
	        else {
	        	System.out.println(" Third is largest : " +Z);
	        }
	            
			return Z;
	    }

	    
	public static void main(String[] args) {
		 new Testmaximum(2,8,7).max();
//		test.findInteger(5, 10, 15);
//		test.findfloat(10.2f, 20.2f, 30.2f);
//		test.findstring("apple", "peach", "banana");
//
		//test.extendmax("apple", "Peach", "banana");
		//test.maxmethd(5, 10, 15);
	

	}

}