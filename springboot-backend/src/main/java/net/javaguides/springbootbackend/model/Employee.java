package net.javaguides.springbootbackend.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// MongoDB stores data in collections. Spring Data MongoDB maps the Customer class into a collection called customer.
//  If you want to change the name of the collection, you can use Spring Data MongoDB’s @Document annotation on the class.

@Document("employees")
public class Employee {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public Employee() {    }
    
    public Employee(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

}
