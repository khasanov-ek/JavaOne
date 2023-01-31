public class Accounts {
	public static void main(String[] args) {
		System.out.println("Class Acccount");
		System.out.println("**************");
		
		/* 
		Account acc1 = new Account("AccountNo1");
		acc1.Display();
		*/
		Account acc1 = new AccountBank("AccountNo1", "Client1", 1000);
		acc1.Display();
		
	}
}


class Account {
	String AccountNo;
	
	public String getAccountNo() {
		return AccountNo;
	}
	
	public Account(String AccountNo) {
		this.AccountNo = AccountNo;
	}
	
	public void Display() {
		System.out.println("Current AccountNo: " + AccountNo);
	}	
}

class AccountBank extends Account {
	int Remain;
	String Client;
	public AccountBank(String AccountNo, String Client, int Remain) {
		super(AccountNo);
		this.Client = Client;
		this.Remain = Remain;
	}
	
	@Override
	public void Display() {
		System.out.println("Current AccountNo: " + AccountNo);
		System.out.println("Client: " + Client + ", AccountNo = " + getAccountNo() + ", Remain = " + Remain);
	}
}

