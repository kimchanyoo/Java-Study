package Chapter5;

class BankAccount {
	private int balance = 0;

	public BankAccount(int money) {
		balance = balance + money;
	}

	public void transfer(int amount, BankAccount otherAccount) {
		otherAccount.balance += amount;
		balance = balance - amount;
		System.out.println("transfer(" + amount + ")  È£Ãâ ÈÄ");
	}

	public void setBalance(int b) {
		balance = b;
	}

	public int getBalance() {
		return balance;
	}

	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
}

public class Programming1 {
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount(10000);
		BankAccount a2 = new BankAccount(0);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2 + "\n");
		a1.transfer(1000, a2);
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);

	}

}
