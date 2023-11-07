package Oops;

public class ICICIBankLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankLoan loan = new BankLoan();
		
		loan.setAge(20);
		loan.setName("Michael John");
		loan.setAmount(1000000);
		
		System.out.println("Name is " + loan.getName());
		System.out.println("Age is " + loan.getAge());
		System.out.println("Amount is " + loan.getAmount());
		
	}

}
