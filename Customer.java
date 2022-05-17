public class Customer {
    private String firstName;
    private String lastName;
    private String number;


    Customer(String firstName, String lastName, String number) {   
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNumber(number);
     }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}