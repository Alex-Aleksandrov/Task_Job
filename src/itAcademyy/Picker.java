package itAcademyy;

public class Picker implements Worker {

    private int salary;
    private WareHouse wareHouse;


    @Override
    public void doWork() {
        salary += 80;
        wareHouse.setCountOrder(wareHouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (wareHouse.getCountOrder() >= 3) {
            salary = salary * 3;
        }
    }

    public Picker(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    public int getSalary() {
        return salary;
    }

    public Picker(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}