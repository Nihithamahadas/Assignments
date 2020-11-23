import java.util.*;
public class Task4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility cu=new Utility();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Customer c=new Customer();
				System.out.println("Name");
				c.setName(sc.next());
				System.out.println("Id");
				c.setCustId(sc.nextInt());
				System.out.println("email");
				c.setEmailId(sc.next());
				System.out.println("mobile");
				c.setMobileNumber(sc.nextLong());
				System.out.println("address");
				c.setAddress(sc.next());
				System.out.println("accnumber");
				c.setAccNumber(sc.next());
				cu.addCustomer(c);
				break;
			case 2:
				System.out.println("Enter id :");
				int id1=sc.nextInt();
				cu.deleteCustomer(id1);
				break;
			case 3:
				System.out.println("Enter id :");
				int id2=sc.nextInt();
				cu.updateCustomer(id2);
				break;
			case 4:
				cu.displayAllContents();
				break;
				
			default:
				System.exit(0);
			}
		}	
	}
}