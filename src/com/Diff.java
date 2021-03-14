package com;
import java.util.*;

public class Diff {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i,j;
		i = (n * (n + 1) * (2 * n + 1)) / 6; 
	    j = (n * (n + 1)) / 2;  
	    j = j * j; 
	    System.out.println(i-j);
	}
	

}
