package homework;

public class Test3_28_6 {
    public static void main(String[] args) {
        Account account = new Account("李湘东",3838438,10000);
        System.out.println(account.getBalance());
        account.takeMoney(1000);
        System.out.println(account.getBalance());
        account.depositMoney(2000);
        System.out.println(account.getBalance());
    }
}
