class Phone {
    String model;
    int storageGB;
    double price;

    Phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }
}

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung S20", 512, 300.0);
        System.out.println("Model: " + phone.model);
        System.out.println("Storage: " + phone.storageGB);
        System.out.println("Price: $" + phone.price);
    }
}
