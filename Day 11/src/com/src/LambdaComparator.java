package com.src;

import java.util.TreeSet;

public class LambdaComparator
{
	public static void main(String[] args)
	{
		TreeSet<String> ts=new TreeSet<String>((Object a,Object b)->{ //lambda expression
			String s1=(String)a;
			String s2=(String)b;
			if(s1.compareTo(s2)<0)  //comparing two string objects
			{
				return 1;
			}
			else
			{
				return -1;
			}
			});
		ts.add("Java");
		ts.add("MySQL");
		ts.add("JDBC");
		System.out.println(ts);  //printing the values
	}

}
