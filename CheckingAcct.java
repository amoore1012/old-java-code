//Checking acct: 19.3.1

public class CheckingAcct extends AbstractBankAccount{
  //constructors referring to the abstract banking account
  public CheckingAcct(){
    super();
  }
  
  public CheckingAcct(String nam, double bal){
    super(nam, bal);
  }
  
  //new balance with the deposit added onto it
  public void deposit(double depo){
    balance += depo;
  }
  
  //new balance with the withdrawal subtracted
  public void withdrawal(double withd){
    balance -= withd;
  }
  
  //the toString method that refers to the abstract banking account
  public String toString(){
    return super.toString();
  }
}