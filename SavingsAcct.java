//Savings acct: 19.3.1
//Written by Audrey Moore due 2/10/17

//set up the class
public class SavingsAcct extends AbstractBankAccount{
  //create the interest variable in this class because interest is only for the savings account
  protected double interest;
  
  //refers to abstract banking account class plus the interest constructor methods
  public SavingsAcct(){
    super();
    interest = 0.0;
  }
  
  public SavingsAcct(String nam, double bal, double inter){
    super(nam, bal);
    interest = inter;
  }
  
  //calculates the balance by adding the deposit
  public void deposit(double depo){
    balance += depo;
  }
  
  //calculates the balance by subtracting the withdrawal
  public void withdrawal(double withd){
    balance -= withd;
  }
  
  //does the super to string but includes the reference to the interest rate
  public String toString(){
    return super.toString()+" and an interest rate of "+interest;
  }
  
  //the getInterestRate so that it can return the interest :)
  public double getInterestRate(){
    return interest;
  }
}