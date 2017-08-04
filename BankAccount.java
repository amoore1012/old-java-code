//Bank Account Class Interface: 19.3.1



public interface BankAccount{
  //declare all of the common methods
  public void deposit(double depo);
  public void withdrawal(double withd);
  public String toString();
  public double getBalance();
}