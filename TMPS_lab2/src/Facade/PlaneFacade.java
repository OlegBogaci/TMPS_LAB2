package Facade;

public class PlaneFacade {
    Plane plane = new Plane();
    public void TakeOff(){
        plane.turnOnElectronics();
        plane.CheckParameters();
        plane.TurnEngines();
        plane.FlapsTakeoff();
        plane.GetToTakeoffPlace();
        plane.FullThrust();
        plane.Airborne();
    }
    public void Landing(){
        plane.setLandingAngle();
        plane.ReduceThrust();
        plane.AltReduction();
        plane.FlapsLanding();
        plane.Landing();
    }
}
