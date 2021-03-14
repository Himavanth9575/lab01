package com;
import java.util.*;

public class Fib {
	public static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=1,temp=0;
		for(int i=3;i<=n;i++)
		{
			temp=a+b;
			a=b;
			b=temp;
		}
		System.out.println("Nth fibonacii number using non recursive : "+b);
		System.out.println("Nth fibonacii number using  recursive : "+fib(n));
		sc.close();
	}

}


