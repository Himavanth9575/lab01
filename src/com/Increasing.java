package com;

import java.util.Scanner;

class Increasing {
    public static void main(String args[]) {
        
       int num;
       boolean flag = false;
        
       Scanner s = new Scanner(System.in); 
       System.out.println("Enter a number : ");
       num = s.nextInt();
       int currentDigit = num % 10;
       num = num/10;
       s.close();
        
       while(num>0){
           if(currentDigit <= num % 10){
               flag = true;
               break;
           }
           currentDigit = num % 10;
           num = num/10;
       }
       if(flag){
           System.out.println("Digits are not in increasing order.");
       }else{
           System.out.println("Digits are in increasing order.");
       }
    }
}
