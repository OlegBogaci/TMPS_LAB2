package DecoratorAdapter;

public class OptionDecorator implements Service {
    private Service service;
    private String producer;
    private double price;

    public OptionDecorator(Service service, String producer, double price) {
        this.service = service;
        this.producer = producer;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }


    public String getLabel() {
        return this.producer + service.getLabel();
    }
}
