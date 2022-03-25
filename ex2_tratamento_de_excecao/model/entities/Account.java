package model.entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawalLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawalLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdrawal(Double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawalLimit=" + withdrawalLimit +
                '}';
    }
}
