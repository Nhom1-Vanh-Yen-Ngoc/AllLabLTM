/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author Van Anh
 */
public class Person implements Comparable <Person> {
    private final String firstName;
    private final String surname;
    public Person(String firstName, String surname)
    {
        this.firstName = firstName;
        this.surname = surname;
    }
    @Override
    public String toString()
    {
        return firstName + " " + surname;
    }
    @Override
    public int compareTo(Person person)
    {
        int result = surname.compareTo(person.surname);
        return result == 0 ? firstName.compareTo(((Person)
        person).firstName):result;
    }
}
