public class Account {

    private String holder;
    private double balance;
    private int number;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account (int number, String holder, double initialDeposit){
        this.holder = holder;
        this.number = number;
        deposit(initialDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }


    public String toString(){
       return "Account: "
        + number
        + ", Holder: "
        + holder
        + ", Balance: $"
        + String.format("%.2f", balance);
    }
}
