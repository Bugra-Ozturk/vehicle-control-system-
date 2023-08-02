public class Demo {
    public static void main(String[] args) {
        // Construct a ContactInfo object
        ContactInfo contactInfo = new ContactInfo("Hürriyet Mh.", "0522222222", "bugrao7turk@gmail.com");

        // Construct a Person object with the ContactInfo as the contactInformation
        Person owner = new Person("Buğra Öztürk", contactInfo);

        // Construct a Bus object with the owner and necessary data
        Bus bus = new Bus ("Mercedes Benz", "34 BGR 34", owner, 30, 10);

        // Print the instance data values of the Bus object using toString method
        System.out.println("Bus Information:\n" + bus.toString() + "\n");
        System.out.println("Owner Information:\n" + bus.getOwner().toString() + "\n");

        // Print to the console the amount of tax that should be paid for this bus object
        int taxAmount = bus.calculateTax();
        System.out.println("Tax amount for the bus: " + taxAmount + " TL");

        // Using the copy constructor, form a copy of the bus object
        Bus copiedBus = new Bus(bus);

        // Show the equality of these two bus objects using the equals method
        if (bus.equals(copiedBus)) {
            System.out.println("The two Bus objects are equal.");
        } else {
            System.out.println("The two Bus objects are not equal.");
        }
    }
}
