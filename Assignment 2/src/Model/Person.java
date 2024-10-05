/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rutugawad
 */
public class Person {
    private String FirstName;
    private String LastName;
    private String SSN;
    private String Age;
    private Address HomeAddress;
    private Address WorkAddress;
    
    public Person() {
        this.HomeAddress = new Address();
        this.WorkAddress = new Address();
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public Address getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(Address HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

    public Address getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(Address WorkAddress) {
        this.WorkAddress = WorkAddress;
    }
    
       @Override
    public String toString(){
        return FirstName;
    }

    
    
    
    
    
}
