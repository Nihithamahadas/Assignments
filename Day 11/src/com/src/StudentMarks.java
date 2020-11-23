package com.src;

import java.util.Arrays;

public class StudentMarks 
{
	String name;
	int total,percent;
	int physicsmarks;
	int sciencemarks;
	int socialmarks;
	char grade;
	public StudentMarks(String name,int physicsmarks,int sciencemarks,int socialmarks,int total,int percent,char grade)
	{
		this.name=name;
		this.physicsmarks=physicsmarks;
		this.sciencemarks=sciencemarks;
		this.socialmarks=socialmarks;
		this.total=total;
		this.percent=percent;
		this.grade=grade;
	}
	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentMarks name=" + name ;
	}
	
}
