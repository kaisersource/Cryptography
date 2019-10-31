/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gcd;
import java.math.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author emanuele
 */

public class Gcd {
     public static int GcD(int a, int b) { 
         return b==0 ? a : GcD(b, a%b); 
     }


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int base = input.nextInt();
		System.out.println("Find the inverse of modulo ->.");
		int mod = input.nextInt();
		if(GcD(base,mod)!=1)
		{
			System.out.println("There's no inverse for " + base + "in mod " + mod);
			System.exit(0);
		}

		int[] coefficients = new int[2];
		coefficients = findInverse(base,mod);
		if(base*coefficients[0]%mod == 1)
		{
			System.out.println("The multiplicative inverse of your number is: " + coefficients[0]);
		}
		else
		{
			System.out.println("The multiplicative inverse of your number is: " + coefficients[1]);	
		}
	}
   //a=bq+r
   //
	
	public static int[] findInverse(int a, int b)
	{
		int x = 0, y = 1, lastx = 1, lasty = 0;
		while(b!=0)
		{
			int q = a/b;

			int temp = a;
			a = b;
			b=temp%b;

                        //swap1
			temp = x;
			x=lastx-q*x;
			lastx=temp;

                        //swap2
			temp = y;
			y=lasty-q*y;
			lasty=temp;
		}

		int[] coefficients = {lastx, lasty, a};
		return coefficients;
	}
	
	

       } 
 

      
     
   
          

        
              

       
  
  
    
  
    

