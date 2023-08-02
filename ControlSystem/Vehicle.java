public abstract class Vehicle {
    private String brand;
    private String licencePlate;
    private Person owner;

    // Constructor without parameters
    public Vehicle() {
        this.brand = null;
        this.licencePlate = null;
        this.owner = null;
    }

    // Constructor with parameters
    /*
    Privacy leak is avoided in constructor methods.
    */
    public Vehicle(String brand, String licencePlate, Person owner) {
        this.brand = brand;
        this.licencePlate = licencePlate;
        this.owner = owner;
    }

    // Copy constructor
    public Vehicle(Vehicle other) {
        this.brand = other.brand;
        this.licencePlate = other.licencePlate;
        this.owner = new Person(other.owner);
    }

    // Accessor methods
    public String getBrand() {
        return brand;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public Person getOwner() {
        return owner;
    }

    // Mutator methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // toString method
    public String toString() {
        return "Brand: " + brand + ", Licence Plate: " + licencePlate + ", Owner: " + owner.getName();
    }

    // equals method
    public boolean equals(Object o) {
        if (o instanceof Vehicle) {
            Vehicle other = (Vehicle) o;
            return this.brand.equals(other.brand) && this.licencePlate.equals(other.licencePlate) &&
                    this.owner.equals(other.owner);
        }
        return false;
    }

    // Abstract method calculateTax
    public abstract int calculateTax();
}
