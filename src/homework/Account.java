package homework;

public class Account {
    String username;
    int password;
    double balance;
    public Account(String username, int password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void takeMoney(double money){
        if (money<=balance){
            balance-=money;
            System.out.println("还剩"+balance);
        }else System.out.println("余额不足");
    }
    public void depositMoney(double money){
        balance+=money;
        System.out.println("余额为"+balance);
    }
}
