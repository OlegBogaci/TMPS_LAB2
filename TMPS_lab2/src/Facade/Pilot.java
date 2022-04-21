package Facade;
//facade
public class Pilot {
    public static void main(String[] args) {
        PlaneFacade Airbus = new PlaneFacade();
        Airbus.TakeOff();
        Airbus.Landing();
    }
}
