/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rutugawad
 */
public class PersonDirectory {
    private ArrayList<Person> PersonList;
    
    public PersonDirectory() {
        this.PersonList= new ArrayList<Person>() ;
    }

    public ArrayList<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(ArrayList<Person> PersonList) {
        this.PersonList = PersonList;
    }
    
    public Person addPerson() {
        
        Person person = new Person();
        PersonList.add(person);
        return person;
        
    }
    
    public void deletePerson(Person person) {
        PersonList.remove(person);
    }
    
    
    public Person searchPerson(String searchPerson) {
        for (Person person : PersonList) {
        
            if (person.getFirstName().contains(searchPerson) ||
                person.getLastName().contains(searchPerson) ||
                person.getHomeAddress().getStreet().contains(searchPerson) ||
                person.getWorkAddress().getStreet().contains(searchPerson)) {
            
                return person;
            }
        }
        return null; 
    }

    
}
