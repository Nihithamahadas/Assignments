import java.util.*;

public class Utility{
    
    private List<Customer> custList=new ArrayList<Customer>();
    public List<Customer> addCustomer(Customer cust){
        custList.add(cust);
        return custList;
    }
    
    public void deleteCustomer(int custId){
        for(Customer c : custList){
            if(c.getCustId()==custId){
                custList.remove(c);
                break;
            }
        }
    }
    
    public Customer updateCustomer(int custId) {
    	Customer cus=null;
    	for(Customer c:custList) {
    		if(c.getCustId()==custId) {
    			cus=c;
    			break;
    		}
    	}
    	return cus;
    }
    public void displayAllContents() {
    	for(Customer c : custList) {
    		System.out.println(c.getName()+"\n"+c.getCustId()+"\n"+c.getEmailId()+"\n"+c.getMobileNumber()+"\n"+c.getAddress()+"\n"+c.getAccNumber());
    	}
    }
    
}