import java.util.*;
public class Task3 {
static int rev=0;
	public int reverse(int n)
	{
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public boolean isPrime(int rev)
	{
		if(rev<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(rev);i++)
		{
			if(rev%i==0)
			{
				return false;
			}
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task3 ts=new Task3();
		for(int i=0;i<args.length;i++)  
		{
			System.out.println(args[i]);  
			int n=Integer.parseInt(args[i]);
			System.out.println(ts.reverse(n));
			System.out.println(ts.isPrime(rev));
		}
	}

}
