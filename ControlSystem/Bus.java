// Bus class inherits from the Vehicle class
public class Bus extends Vehicle {

    // Private member variables for the Bus class
    private int capacity; // passenger capacity of the bus
    private int ageOfBus; // age of the bus in years

    // Default constructor initializes member variables to null
    public Bus() {
        super();
        this.capacity = 0;
        this.ageOfBus = 0;
    }

    // Constructor with three parameters initializes member variables with given values
    public Bus(String brand, String licencePlate, Person owner, int capacity, int ageOfBus) {
        super(brand, licencePlate, owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }

    // Copy constructor creates a new Bus object with the same values as the original object
    public Bus(Bus other) {
        super(other);
        this.capacity = other.capacity;
        this.ageOfBus = other.ageOfBus;
    }

    // Accessor and mutator methods for the Bus class
    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeOfBus() {
        return this.ageOfBus;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    // Method to calculate and return the amount of govermental vehicle tax to be paid
    public int calculateTax() {
        if (this.ageOfBus < 5) {
            return 4000;
        } else if (this.ageOfBus >= 5 && this.ageOfBus <= 10) {
            return 3000;
        } else {
            return 2000;
        }
    }

    // Override the toString method to return a string representation of the Bus object
    @Override
    public String toString() {
        return "Brand: " + this.getBrand() + ", Licence Plate: " + this.getLicencePlate() + ", Owner: " + this.getOwner().toString() + ", Capacity: " + this.capacity + ", Age of Bus: " + this.ageOfBus;
    }

    // Override the equals method to compare two Bus objects for equality
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Bus other = (Bus) obj;

        if (!super.equals(other)) {
            return false;
        }

        if (this.capacity != other.capacity) {
            return false;
        }

        if (this.ageOfBus != other.ageOfBus) {
            return false;
        }

        return true;
    }
}
