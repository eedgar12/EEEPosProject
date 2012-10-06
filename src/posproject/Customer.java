
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class Customer {
    private String firstName = "";
    private String lastName = "";
    private String id;

    /*
     * Constructor
     */
    public Customer(String id, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
