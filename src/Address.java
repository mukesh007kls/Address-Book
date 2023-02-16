public class Address extends Contact {
    String address;

    public Address() {

    }

    public Address(String firstName, String lastName, long phoneNumber, String address) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
