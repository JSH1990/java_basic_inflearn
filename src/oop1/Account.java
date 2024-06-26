package oop1;

public class Account {
    int balance; //잔액

    void deposit(int amount){ //입금 메서드
         balance += amount;
        System.out.println("현재 잔액은 " + balance);
    }

    void withdraw(int amount){
        if(balance >= amount){ //입금돈
            balance -= amount;
            System.out.println("현재 잔액은 " + balance);
        }else {
            amount -= balance;
        System.out.println("잔액부족");
        System.out.println("부족한 금액" + amount);

    }
}
    }
