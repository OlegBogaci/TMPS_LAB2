package DecoratorAdapter;

public class TireChange implements Service {
    private String producer;
    private double price;

    public TireChange(String producer, double price) {
        this.producer = producer;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getLabel() {
        return producer+ " tires changed - "+this;
    }
}
