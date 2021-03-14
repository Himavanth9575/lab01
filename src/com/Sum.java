package com;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum = 0;
		s.close();
		 
	    while (n != 0) {
	        sum = sum + (n%10)*(n%10)*(n%10);
	        n = n / 10;
	    }
	    System.out.println(sum);
	}
}
