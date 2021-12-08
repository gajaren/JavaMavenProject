package BuilderPattern;

public class Main {

    public static void main (String args[]) {
        //Car can be configured with ease now
        Car car = new Car.CarBuilder("huyndai", "Sports")
                .setColor("TomatoRed")
                .setIsAutomatic(Boolean.FALSE)
                .buildCar();
        System.out.println(car);

        //--------------------------

        Car car2 = new Car.CarBuilder("Maruti", "Passenger")
                .buildCar();
        System.out.println(car2);

        //--------------------------

        //Sequence of parameters does not matter anymore
        Car car3 = new Car.CarBuilder("Kia", "SUV")
                .setColor("White")
                .setIsAutomatic(Boolean.TRUE)
                .setEngineInLtr(2)
                .setFuel("Petrol")
                .buildCar();
        System.out.println(car3);
    }
}
