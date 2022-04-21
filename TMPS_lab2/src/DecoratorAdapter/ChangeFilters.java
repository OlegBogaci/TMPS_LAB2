package DecoratorAdapter;

public class ChangeFilters extends OptionDecorator {
    public ChangeFilters(Service service){
        super(service,"michelin",10);
    }
}
