package BuilderPattern;

public class Car {

    private String company; //Required
    private String carType; //Required
    private int engineInLtr; //Configurable
    private String color; //Configurable
    private String fuel; //Configurable
    private Boolean isAutomatic; //Configurable

    //Old way of initializing parameters through constructor
    /*
    public Car(String company, String carType, int engineInLtr, String color,
                String fuel, Boolean isAutomatic) {
        this.company = company;
        this.carType = carType;
        this.engineInLtr = engineInLtr;
        this.color = color;
        this.fuel = fuel;
        this.isAutomatic = isAutomatic;
    }
    */

    //Constructor with Builder class.
    private Car (CarBuilder builder) {
        this.company = builder.company;
        this.carType = builder.carType;
        this.engineInLtr = builder.engineInLtr;
        this.color = builder.color;
        this.fuel = builder.fuel;
        this.isAutomatic = builder.isAutomatic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", carType='" + carType + '\'' +
                ", engineInLtr=" + engineInLtr +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", isAutomatic=" + isAutomatic +
                '}';
    }

    public static class CarBuilder {
        private String company;
        private String carType;
        private int engineInLtr;
        private String color;
        private String fuel;
        private Boolean isAutomatic;

        //consutructor for Required parameters
        public CarBuilder(String company, String carType) {
            this.company = company;
            this.carType = carType;
        }

        //Setter returning object with parameter
        public CarBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public CarBuilder setCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder setEngineInLtr(int engineInLtr) {
            this.engineInLtr = engineInLtr;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setFuel(String fuel) {
            this.fuel = fuel;
            return this;
        }

        public CarBuilder setIsAutomatic (Boolean isAutomatic) {
            this.isAutomatic = isAutomatic;
            return this;
        }

        //Build Car object which is configured with Builder Setters
        public Car buildCar() {
            Car newCar = new Car(this);
            return newCar;
        }
    }
}
