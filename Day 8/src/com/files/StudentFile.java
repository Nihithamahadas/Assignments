package com.files;

import java.io.DataOutputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.Scanner;

public class StudentFile 
{
	
		private String m3;
		private String m2;
		private String S;
		private String sname;
		private String m1;

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			int n;
			System.out.println("Enter how many students");
			n=s.nextInt();
			FileOutputStream fos=null;
			DataOutputStream dos=null;
			for(int i=0;i<n;i++)
			{
				System.out.println("enter name of "+i+"th student");
				String name=s.next();
				System.out.println("enter dob of "+i+"th student");
				String dob=s.next();
				System.out.println("enter marks m1:");
				int p=s.nextInt();
				System.out.println("enter marks m2:");
				int q=s.nextInt();
				System.out.println("enter marks m3:");
				int r=s.nextInt();
				StudentFile s1=new StudentFile();
				int avg=s1.average(p,q,r);
				int tot=s1.total(p, q, r);
				String filename=name+".txt";
				String s2="";
				s2=s2+"\n"+"name : "+s1.sname+"\n"+"dob : "+s1.S+"\n"+"marks 1: "+s1.m1+"\n"+"marks 2 : "+s1.m2+"\n"+"marks 3 : "+s1.m3
						+"\n"+"average :"+avg+"\n"+"total : "+tot;
				try {
					fos=new FileOutputStream(filename);
					dos=new DataOutputStream(fos);
					byte[]b=s2.getBytes();
					dos.write(b);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try
				{
					fos.close();
					dos.close();
				}
				finally
				{
					System.out.println("written");
				}
			}
		}

		private int total(int p, int q, int r) {
			// TODO Auto-generated method stub
			return 0;
		}

		private int average(int p, int q, int r) {
			// TODO Auto-generated method stub
			return 0;
		}

	


}
