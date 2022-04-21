package DecoratorAdapter;

public class Coffee {
    private String producer;
    private double price;

    public double getPrice(){
        return price;
    }
    public String getLabel(){
        return producer;
    }
}
