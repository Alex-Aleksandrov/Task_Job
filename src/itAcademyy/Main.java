package itAcademyy;

public class Main {

    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Picker picker = new Picker(wareHouse);
        Courier courier = new Courier(wareHouse);

        picker.doWork();
        courier.doWork();
        picker.doWork();
        courier.doWork();

        System.out.println(wareHouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();



        picker.bonus();
        courier.bonus();

        System.out.println(wareHouse + " " + picker + " " + courier);
    }
}
