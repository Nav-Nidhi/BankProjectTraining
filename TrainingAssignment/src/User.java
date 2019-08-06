import java.util.ArrayList;
import java.util.Scanner;

interface Info {
	String enter_username();
	long enter_phonenumber();
	int enter_empid();
	ArrayList<String> enter_address();
}
class User implements Info{
	long accountbalance;//=2000000;
	long parentaccountbalance;//=500001;
	String name;
	long phone;
	int empid;
	ArrayList<String> address;
	
	String loantype;//="education";
	long loanamount;//=5000000;
	
	
	
	
	public long getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(long accountbalance) {
		this.accountbalance = accountbalance;
	}
	public long getParentaccountbalance() {
		return parentaccountbalance;
	}
	public void setParentaccountbalance(long parentaccountbalance) {
		this.parentaccountbalance = parentaccountbalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public ArrayList<String> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public long getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(long loanamount) {
		this.loanamount = loanamount;
	}
	
	
	
	public User(long accountbalance, long parentaccountbalance, String name, long phone, int empid,
			ArrayList<String> address, String loantype, long loanamount) {
		super();
		this.accountbalance = accountbalance;
		this.parentaccountbalance = parentaccountbalance;
		this.name = name;
		this.phone = phone;
		this.empid = empid;
		this.address = address;
		this.loantype = loantype;
		this.loanamount = loanamount;
	}
	
	
	public User() {
	}


	Scanner sc=new Scanner(System.in);
	public String enter_username(){ 
		System.out.println("Enter firstname: ");
		String firstname=sc.nextLine();
		System.out.println("Enter lastname: ");
		String lastname=sc.nextLine();
		return firstname+" "+lastname; 
	}
	public long enter_phonenumber(){
		System.out.println("enter phone number: ");
		int phonenumber=sc.nextInt();
		return phonenumber;
	}
	public int enter_empid(){
		System.out.println("enter employee id: ");
		int empid=sc.nextInt();
		return empid;
	}
	public ArrayList<String> enter_address(){
		ArrayList<String> address=new ArrayList<String>();
		System.out.println("enter honuse no:");
		address.add(sc.next());
		System.out.println("enter area");
		address.add(sc.nextLine());
		System.out.println("enter city");
		address.add(sc.nextLine());
		System.out.println("enter state");
		address.add(sc.nextLine());
		System.out.println("enter country");
		address.add(sc.nextLine());
		System.out.println("enter pincode");
		address.add(sc.nextLine());
		return address;
		
	}
}

	
		
	
