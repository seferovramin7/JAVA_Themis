package Lesson_20;


class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Current Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Current Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + balance);
        }
    }
}


class DepositThread extends Thread {
    BankAccount ba;
    double amount;

    public DepositThread(BankAccount ba, double amount) {
        this.ba = ba;
        this.amount = amount;
    }

    @Override
    public void run() {
        ba.deposit(amount);
    }
}


class WithdrawalThread extends Thread {
    BankAccount ba;
    double amount;

    public WithdrawalThread(BankAccount ba, double amount) {
        this.ba = ba;
        this.amount = amount;
    }

    @Override
    public void run() {
        ba.withdraw(amount);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        DepositThread dt = new DepositThread(bankAccount, 50);
        WithdrawalThread wt = new WithdrawalThread(bankAccount, 60);
        WithdrawalThread wt1 = new WithdrawalThread(bankAccount, 250);

        try {
            dt.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dt.start();


        try {
            wt.join();
            wt1.join();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wt.start();
        wt1.start();
    }
}