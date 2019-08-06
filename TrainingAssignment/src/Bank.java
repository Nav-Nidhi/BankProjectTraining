import java.util.ArrayList;
import java.util.Scanner;
import java.util.spi.LocaleNameProvider;

interface Loan{
	double loan();
}
class houseloan implements Loan{
	public double loan(){
		double interest=0.06;
		return interest;
		
	}
}
class eduloan implements Loan{
	public double loan(){
		double interest=0.08;
		return interest;
		
	}
}
class personalloan implements Loan{
	public double loan(){
		double interest= 0.05;
		return interest;
		
	}
}class travelloan implements Loan{
	public double loan(){
		double interest=0.01;
		return interest;
		
	}
}
public class Bank {
	public static void main(String[] args){
		User user=new User();
		Scanner sc=new Scanner(System.in);
		String name=user.enter_username();
		long  phone=user.enter_phonenumber();
		int empid=user.enter_empid();
		ArrayList<String>address=user.enter_address();
		
		System.out.println("Enter account balance");
		long accountBalance = sc.nextLong();
		System.out.println("Enter parent account balance");
		long parentBalance = sc.nextLong();
		System.out.println("Enter loan type\n1. housing\n2. education\n3. personal\n4. travel\n(Enter the string)");
		String loanType=sc.next();
		System.out.println("Enter loan amount");
		long loanAmount=sc.nextLong();
		
		user=new User(accountBalance, parentBalance, name, phone, empid, address, loanType, loanAmount);
		
		boolean eligible=Bank.checkeligibility(user);
		if(!eligible){
			System.out.println("not eligible for the loan");
		}
		else{
			Loan loanobj=null;
			switch(user.loantype){
			case "housing":
				loanobj=new houseloan(); 
			case "education":
				loanobj=new eduloan();
			case "person":
				loanobj=new personalloan();
			case "travel":
				loanobj=new travelloan();
			
			}

			System.out.println("\nLoan Repay Amount is ");
			System.out.println(Bank.loanCalculator(user.getLoanamount(), user.getLoantype(), loanobj));
			//System.out.println(loanobj.loan());
		}
		
	}
	public static boolean checkeligibility(User user){
		if(user.loanamount>10000000)
		return false;
		else{
			String type=user.loantype;
			boolean eligible;
			
			switch(type){
			case "housing":
				if(user.getAccountbalance()>1000000)
					eligible=true;
				else eligible= false;
				break;
				
			case "education":
				if(user.getParentaccountbalance()>1000000)
					eligible=true;
				else eligible= false;
				break;
			case "person":
				eligible=true;
				break;
			case "travel":
				if(user.getAccountbalance()>5000000)
					eligible=true;
				else eligible= false;
				break;
			default:
				eligible=false;
			
			
			}
			return eligible;
			
		}
		
	}
	public static double loanCalculator(long loanAmount, String loanType, Loan loanObj){
		double calcAmount=0;
		switch(loanType){
		case "housing":calcAmount=Math.pow(1+loanObj.loan(), 5)*loanAmount;
				break;
		case "education":calcAmount=Math.pow(1+loanObj.loan(), 6)*loanAmount;
		break;
		case "personal":calcAmount=Math.pow(1+loanObj.loan(), 1)*loanAmount;
			break;
		case "travel": calcAmount=loanAmount*loanObj.loan()*1;
			
			break;
		}
		return calcAmount;
	}

}
