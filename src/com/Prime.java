package com;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.close();
		int t;
		for(int i=2;i<k;i++)
		{
			t=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					t=1;
				}
			}
			if(t==0)
				System.out.print(i+" ");

		}

	}

}