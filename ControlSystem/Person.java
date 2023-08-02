public class Person {
    private String name;
    private ContactInfo contactInformation;

    // Constructor without parameters
    public Person() {
        this.name = null;
        this.contactInformation = null;
    }

    // Constructor with two parameters
    public Person(String name, ContactInfo contactInformation) {
        this.name = name;
        this.contactInformation = new ContactInfo(contactInformation);
        /*
        The ContactInfo object is taken as a parameter in the constructors and a copy of this object is used in the class.
        This prevents direct access to properties inside the ContactInfo object. In this way, privacy leak is avoided.
        */
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.contactInformation = new ContactInfo(other.contactInformation);
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public ContactInfo getContactInformation() {
        return new ContactInfo(contactInformation);
        /*
        ContactInfo object is returned by copying in accessor methods. In this way, direct access of the variable
        is prevented, only its copy is returned. In this way, privacy leak is avoided.
         */
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setContactInformation(ContactInfo contactInformation) {
        this.contactInformation = new ContactInfo(contactInformation);
    }

    // toString method
    @Override
    public String toString() {
        return "Name: " + name + "\n" + contactInformation.toString();
    }

    // Equals method
    /* Comparison is made by making a copy of the ContactInfo object in the equals method.
       This prevents direct access to the properties of the ContactInfo object. In this way, privacy leak is avoided.
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person other = (Person) obj;

        return this.name.equals(other.name)
                && this.contactInformation.equals(other.contactInformation);
    }
}
