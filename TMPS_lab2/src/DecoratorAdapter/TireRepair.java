package DecoratorAdapter;

public class TireRepair implements Service {
    private String producer;
    private double price;

    public TireRepair(String producer, double price) {
        this.producer = producer;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return "Oil from "+producer+" was changed - ";
    }
}

