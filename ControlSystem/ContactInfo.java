public class ContactInfo {
    private String homeAddress;
    private String telNumber;
    private String eMail;

    // Constructor without parameters
    public ContactInfo() {
        this.homeAddress = null;
        this.telNumber = null;
        this.eMail = null;
    }

    // Constructor with three parameters
    public ContactInfo(String homeAddress, String telNumber, String eMail) {
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
        this.eMail = eMail;
    }

    // Copy constructor
    public ContactInfo(ContactInfo other) {
        this.homeAddress = other.homeAddress;
        this.telNumber = other.telNumber;
        this.eMail = other.eMail;
    }

    // Accessor methods
    public String getHomeAddress() {
        return homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEMail() {
        return eMail;
    }

    // Mutator methods
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    // toString method
    @Override
    public String toString() {
        return "Home Address: " + homeAddress + "\nTelephone Number: " + telNumber + "\nEmail: " + eMail;
    }

    // Equals method
    /*
    This implementation uses the equals method of the String class
    to compare the values of the homeAddress, telNumber, and eMail variables for equality.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof ContactInfo)) {
            return false;
        }

        ContactInfo other = (ContactInfo) obj;

        return this.homeAddress.equals(other.homeAddress)
                && this.telNumber.equals(other.telNumber)
                && this.eMail.equals(other.eMail);
    }
}
