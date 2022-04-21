package DecoratorAdapter;

public class CoffeeAdapter extends OptionDecorator{
    public CoffeeAdapter(Service service){
        super(service,"nescafe",1);
    }
}
