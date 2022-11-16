public class SavingsAccount  {
    private double balance;
    private double interest,amount;
    public SavingsAccount()
    {
        balance=0;
    }
        public void BankAccount(double balance,double amount){
        this.balance=balance;
        this.amount=amount;

        }
public double addedinterest(){
       this. interest=balance*amount/100;
balance=balance+interest;


    return balance;
}
public double getBalance (){
        return addedinterest();

}




}
