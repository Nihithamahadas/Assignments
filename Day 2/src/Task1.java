import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{5,6},{7,8}};
		int s[][]=new int[2][2];
		int d[][]=new int[2][2];
		int m[][]=new int[2][2];		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				s[i][j]=a[i][j]+b[i][j];
				d[i][j]=b[i][j]-a[i][j];
				m[i][j]=a[i][j]*b[i][j];
				
			}
		}
		System.out.println("The sum of matrix is :");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(s[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("The substraction of matrix is:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(d[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println("The multiplication of matrix is: ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(m[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	

}
