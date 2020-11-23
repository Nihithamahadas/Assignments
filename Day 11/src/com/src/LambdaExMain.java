package com.src;

public class LambdaExMain 
{
	public static void main(String args[])
	{
		LambdaExp l=(a,b)->System.out.println(a.length()+" "+b.length());  //lambda returning the length of the strings
		l.functn("Pavithra", "Vellaichamy");
		l=(a,b)->System.out.println(a.concat(b));  //concatenation of the strings
		l.functn("Pavithra", " Vellaichamy");
		l=(a,b)->System.out.println(a.compareTo(b));  //comparing the strings  
		l.functn("Pavithra", "Vellaichamy");
	}
}
