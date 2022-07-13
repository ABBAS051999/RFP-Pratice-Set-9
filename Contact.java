public class Contact {
    // declare variables
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;

    // Constructor
    public Contact() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      //System.out.println("name:\t" + this.getFirstName());

    @Override
    public String toString() {
        return  "Contact [firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", email=" + email + "]";
    }
}
