package Facade;

public class Plane {
    public void turnOnElectronics(){
        System.out.println("All systems are active...");
    }
    public void CheckParameters(){
        System.out.println("Fuel level - OK\nTemperature and pressure - OK\nDoors closed - OK ");
    }
    public void FlapsTakeoff(){
        System.out.println("Flaps position set to takeoff...");
    }
    public void TurnEngines(){
        System.out.println("All engines turned on...");
    }
    public void GetToTakeoffPlace(){
        System.out.println("Plane is on place");
    }
    public void FullThrust(){
        System.out.println("Increasing speed");
    }
    public void Airborne(){
        System.out.println("AIRBORNE!");
    }
    //////////////////////////////////////
    public void setLandingAngle(){
        System.out.println("Landing angle set");
    }
    public void ReduceThrust(){
        System.out.println("Speed is reducing");
    }
    public void FlapsLanding(){
        System.out.println("Flaps set to landing position");
    }
    public void AltReduction(){
        System.out.println("Altitude is reducing");
    }
    public void Landing(){
        System.out.println("Successful landing");
    }

}
