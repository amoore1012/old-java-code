//Bank Account Abstract Class: 19.3.1

abstract public class AbstractBankAccount implements BankAccount{
  
  //the protected balance and name variables that areused for everything
  protected double balance;
  protected String name;
  protected String accnum;
  
  //the default constructor
  public AbstractBankAccount(){
    balance = 0;
    name = "";
    String a = ""+(int) (Math.random()*9+1);
    String b = ""+(int) (Math.random()*9+1);
    String c = ""+(int) (Math.random()*9+1);
    String d = ""+(int) (Math.random()*9+1);
    String e = ""+(int) (Math.random()*9+1);
    String f = ""+(int) (Math.random()*9+1);
    accnum = a+b+c+d+e+f;
  }
  
  //the regular constructor
  public AbstractBankAccount(String nam, double bal){
    balance = bal;
    name = nam;
    String a = ""+(int) (Math.random()*9+1);
    String b = ""+(int) (Math.random()*9+1);
    String c = ""+(int) (Math.random()*9+1);
    String d = ""+(int) (Math.random()*9+1);
    String e = ""+(int) (Math.random()*9+1);
    String f = ""+(int) (Math.random()*9+1);
    accnum = a+b+c+d+e+f;
  }
  
  //these have to be dealt with individually because the checking account and savings account are separate balances
  abstract public void deposit(double depo);
  
  abstract public void withdrawal(double withd);
  
  //returns the balance
  public final double getBalance(){
    return balance;
  }
  
  public String toString(){
    String str = name+" your account number is "+accnum+" and your balance is "+balance;
    return str;
  }
  
}