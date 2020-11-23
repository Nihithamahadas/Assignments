import java.util.*;
public class Task2 {
 
	public static boolean isPrime(int b)
	{
		if(b<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(b);i++)
		{
			if(b%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	public static boolean isPalindrome(int b)
	{
		int num=b,rev=0;
		   while(b!=0) {
			   rev=rev*10+b%10;
			   b/=10;
		   }
		   return (rev==num);
		
	}
	public static boolean isPerfect(int b)
	{
		int s=0;
		   for(int i=1;i<b;i++) {
			   if(b%i==0) {
				   b+=i;
			   }
		   }
		   return (s==b);
	}
	public static boolean isArmstrong(int b)
	{
		 int num=b,s=0;
		   while(b!=0) {
			   int r=b%10;
			   s+=r*r*r;
			   b/=10;
		   }
		   return (s==num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements you want: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		Task2 ts=new Task2();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			int b=arr[i];
			System.out.println(ts.isPrime(b));
			System.out.println(ts.isPalindrome(b));
			System.out.println(ts.isPerfect(b));
			System.out.println(ts.isArmstrong(b));
		}
		
        
	}

}
