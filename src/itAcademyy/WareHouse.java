package itAcademyy;

public class WareHouse {
    private int countOrder;
    private int balance;

    public WareHouse() {
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }

    public WareHouse(int countOrder, int balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
