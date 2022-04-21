package DecoratorAdapter;

public class ElectronicTest extends OptionDecorator{
    public ElectronicTest(Service service){
        super(service,"none",5);
    }
}
