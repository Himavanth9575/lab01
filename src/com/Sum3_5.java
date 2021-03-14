package com;

import java.util.*;

public class Sum3_5 {
static int sum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%3==0 || i%5==0)
		{
			sum+=i;
		}
	}
	return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		System.out.println(sum(num));
	}

}
