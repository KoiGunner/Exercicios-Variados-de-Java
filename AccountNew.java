public class AccountNew{
  private int numberAccount;
  private String nameOwner;
  private double balance = 0.0;


  public void getNumberAccount(){
    return numberAccount;
  }

  public int setNumberAccount(int numberAccount){
    this.numberAccount = numberAccount;
  }
    
  public void getNameOwner(){
    return nameOwner;
  }
  
  public String setNameOwner(String nameOwner){
    this.nameOwner = nameOwner;
  }

  public void getBalance(){
    return balance;
  }
  
  public double setBalance(double balance){
    this.nameOwner = nameOwner;
  }
  
  public Account(){}
  public Account(int numberAccount, String nameOwner, double balance){
    this.numberAccount = numberAccount;
    this.nameOwner = nameOwner;
    this.balance = balance;
  }
  public Account(int numberAccount, String nameOwner){
    this.numberAccount = numberAccount;
    this.nameOwner = nameOwner;
  }

  public double withdraw (double amount){
    if(balance <= 0){
      System.out.println("Insuficient funds");
    }
    else {
    balance -= amount;
    }
  }
  
  public double deposit(double amount){
       balance += amount;
  }
