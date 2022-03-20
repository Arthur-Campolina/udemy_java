package entities;

public class Account {
	
	private static double TAX = 5.0;
	
	private int accountNumber;
	private String name;
	private double totalMoney;
	
	public Account(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public Account(int accountNumber, String name, double totalMoney) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.totalMoney = totalMoney;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void newDeposit (double deposit) {
		this.totalMoney += deposit;
	}
	
	public void newWithdrawal (double withDrawal) {
		this.totalMoney -= withDrawal + TAX;
	}
	
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", totalMoney);
	}
}
