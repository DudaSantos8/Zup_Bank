public class Address {
    private String postalCode;
    private String address;
    private String number;

    public Address(String postalCode, String address, String number) {
        this.postalCode = postalCode;
        this.address = address;
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
