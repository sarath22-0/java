public class Encapsulation{
    private String accountNumber;
    private double balance;
    
    public Encapsulation (String accountNumber,double initialBalace) {
        this.accountNumber=accountNumber;
        if (initialBalace >=0){
            this.balance=initialBalace;
        }
    }

    public double getBalace(){
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance+=amount;
        }
    }
}