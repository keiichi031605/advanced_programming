package week4;

public abstract class Account {
  private String ID;
  private double balance;
  private String name;
  
  public Account(String ID, String name, double initial){
    this.ID = ID;
    this.name = name;
    balance = initial;
  }

  public void deduct(double amt) throws BalanceException {   
    if (amt > balance) throw new BalanceException();
    else balance -= amt;
  }
  public void add(double amt){ 
    balance += amt;
  }
  public double getBalance() { 
    return balance; 
  }
  public String getID() { 
    return ID;
  }
  public abstract void withdraw(double amt) throws BalanceException, ExceedMaxException;
  public abstract void deposit(double amt);
}
