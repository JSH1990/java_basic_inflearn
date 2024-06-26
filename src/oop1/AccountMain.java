package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(900);
        account.withdraw(1500);

    }
}
