package DecoratorAdapter;

//decorator and adapter
public class AutoService {
    public static void main(String[] args) {
        Service tires = new TireChange("BMW",200);
        Service filters = new ChangeFilters(tires);
        Service electro = new ElectronicTest(filters);
        System.out.println(electro.getPrice());


        Service tires1 = new TireRepair("Honda",222);
        Service coffee = new CoffeeAdapter(tires1);
        System.out.println(coffee.getPrice());
    }
}
