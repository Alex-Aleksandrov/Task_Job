package itAcademyy;

public class Courier implements Worker {

    private int salary;
    private WareHouse wareHouse;

    @Override
    public void doWork() {
        salary += 100;
        wareHouse.setBalance(wareHouse.getBalance() + 1000);
    }

    @Override
    public void bonus() {
        if (wareHouse.getBalance() >= 5000) {
            salary = salary * 2;
        }
    }

    public Courier(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    public Courier(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
