
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The Customer class holds customer information: firstName, lastName, and ID.
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
        //needs validation
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    
    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        //needs validation
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        //needs validation
        this.firstName = firstName;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        //needs validation
        this.id = id;
    }

}
