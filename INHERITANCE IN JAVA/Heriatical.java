class Vchicle {
    void start() {
        System.out.println("Vehicle starts with an engine");
    }
}

class Car extends Vchicle {
    void Wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class Bike extends Vchicle {
    void Wheels() {
        System.out.println("Bike has 3 wheels");
    }
}

class Truck extends Vchicle {
    void Wheels() {
        System.out.println("Truck has 6 wheels");
    }
}

public class Heriatical {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.start();
        mycar.Wheels();

        Bike mybike = new Bike();
        mybike.start();
        mybike.Wheels();

        Truck mytruck = new Truck();
        mytruck.start();
        mytruck.Wheels();
    }
}
