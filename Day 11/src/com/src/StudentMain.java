package com.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args)
	{
		
		ArrayList<StudentMarks> al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of students : ");
		int n=sc.nextInt();
		int total=0,percent;
		StudentMarks sm=null;  //initializing the constructor
		char grade;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name : ");
			String name=sc.next();
			System.out.println("Enter the physics marks : ");
			int physicsmarks=sc.nextInt();
			System.out.println("Enter the science marks : ");
			int sciencemarks=sc.nextInt();
			System.out.println("Enter the social marks : ");
			int socialmarks=sc.nextInt();
			total=physicsmarks+socialmarks+sciencemarks;  //calculating the total
			percent=total/3;
			if(percent>90) //checking the grade
			{
				grade='s';
			}
			else if(percent>70 && percent<90)
			{
				grade='a';
			}
			else if(percent>50 && percent>70)
			{
				grade='b';
			}
			else
			{
				grade='f';
			}
			sm=new StudentMarks(name,physicsmarks,sciencemarks,socialmarks,total,percent,grade);
			al.add(sm);
			System.out.println(al);
		}
		ArrayList al1=(ArrayList)al.stream()  //lambda expression for checking who got fail marks
					.filter(p->p.physicsmarks<50)
					.collect(Collectors.toList());
		System.out.println("Failed in Physics : ");
		System.out.println(al1);
		ArrayList al2=(ArrayList<StudentMarks>)al.stream()
				.filter(p->p.sciencemarks<50)
				.map(p->p)
				.collect(Collectors.toList());
		 System.out.println("Failed in Science : ");
		 System.out.println(al2);
		 ArrayList al3=(ArrayList<StudentMarks>)al.stream()
					.filter(p->p.socialmarks<50)
					.map(p->p)
					.collect(Collectors.toList());
		 System.out.println("Failed in Social : ");
			 System.out.println(al3);
	     ArrayList al4=(ArrayList<StudentMarks>)al.stream()   //lambda expression for checking who got pass marks
	    		    .filter(p->p.physicsmarks>50)
	    		    .filter(p->p.sciencemarks>50)
					.filter(p->p.socialmarks>50)
					.map(p->p)
					.collect(Collectors.toList());
	     System.out.println("Passed in exam : ");
				 System.out.println(al4); 
	}

}
