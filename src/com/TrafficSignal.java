package com;
 import java.util.Scanner;
public class TrafficSignal {
	public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int colour= s.nextInt();
		switch(colour) {
		case 1:
			System.out.println("Stop!");
			break;
		case 2:
			System.out.println("Start");
			break;
		case 3:
			System.out.println("Go!");
			break;
		default:
			System.out.println("no colour selected");
		s.close();
		}
		}
}
