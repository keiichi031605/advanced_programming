package week4;

public class DepositAccount extends Account{

	public DepositAccount(String string, String string2, double d) {
		super(string, string2, d);
	}

	public void deposit(double d) {
		d += d;
	}

	@Override
	public void withdraw(double amt) throws BalanceException, ExceedMaxException {
		// TODO Auto-generated method stub
		
	}
}
