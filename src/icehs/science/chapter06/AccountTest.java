package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account hong = new Account();
		hong.accName = "ȫ�浿";
		hong.accNo = "123-45678";
		hong.balance = 10000;
		
		hong.printAccountInfo();
		
		hong.deposit(20000);
		
		hong.withdraw(45000);
		
	}

}
