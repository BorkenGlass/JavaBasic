package AbstractSolve;
abstract class Vehicle{
    public abstract void move();
    public abstract void permission();
    public  void refill_tank(){
        System.out.println("Filled with fuel");
    }
}
class MotorVehicle{
    public void refill_tank(){
        System.out.println("Filled with fuel");
    }
}
class cng extends MotorVehicle{

}
class car extends MotorVehicle{

}
class bus extends MotorVehicle{

}
class Rickshaw extends Vehicle{
    public void move(){
        System.out.println("Paddling the Chain");
    }
    public void permission(){
        System.out.println("Rickshaw can move in narrow streets");
    }
}
class CNG extends Vehicle{
    public void move(){
        System.out.println("Burning engine fuel");
    }
    public void permission(){
        System.out.println("CNG can move in city streets");
    }
}
class Car extends Vehicle{
    public void move(){
        System.out.println("Burning engine fuel");
    }
    public void permission(){
        System.out.println("Car can move in highway");
    }
}
class Bus extends Vehicle{
    public void move(){
        System.out.println("Burning engine fuel");
    }
    public void permission(){
        System.out.println("Bus can move in expressway");
    }

}


public class Main {
    public static void main(String[] args) {
        Vehicle rickshaw = new Rickshaw();
        Vehicle cng = new CNG();
        Vehicle car = new Car();
        Vehicle bus = new Bus();

        MotorVehicle cng1 = new cng();
        MotorVehicle car1 = new car();
        MotorVehicle bus1 = new bus();

        rickshaw.move();
        cng.move();
        car.move();
        bus.move();

        System.out.println();

        rickshaw.permission();
        cng.permission();
        car.permission();
        bus.permission();

        System.out.println();

        ((MotorVehicle)cng1).refill_tank();
        ((MotorVehicle)car1).refill_tank();
        ((MotorVehicle)bus1).refill_tank();


    }


}
