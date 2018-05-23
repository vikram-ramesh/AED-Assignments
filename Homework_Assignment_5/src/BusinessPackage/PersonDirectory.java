/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class PersonDirectory {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public Person findPersonByLastName(String lastName){
        for (Person p:personList) {
            if (p.getLastName().equals(lastName)) {
                return p;
            }
        }
        return null;
    }
    
    public void deletePerson(Person air){
        personList.remove(air);
    }
    
    
    
}
