package task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        counter++;
        id = counter;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "Customer name: " + firstName + " " + lastName +
                "\nCustomer user name: " + userName + "\nCustomer id: " + id;

    }

}
