package com.fs.structural.criteriaPattern;

import com.fs.common.BaseUnitTest;
import com.fs.structural.criteriaPattern.criteria.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest extends BaseUnitTest {

    Person person;

    private ArrayList<Person> persons;

    private Male male;
    private Female female;
    private Single single;

    private And singleMale;
    private Or singleOrFemale;


    @Before
    public void setUp() {

        persons = new ArrayList<Person>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        male = new Male();
        female = new Female();
        single = new Single();
        singleMale = new And(single, male);
        singleOrFemale = new Or(single, female);
    }

    @Test
    public void find_males_returnsExpectedPeople() {
          printPersons(male.meetCriteria(persons));
    }

    @Test
    public void find_females_returnsExpectedPeople() {
        printPersons(female.meetCriteria(persons));
    }

    @Test
    public void find_singlemales_returnsExpectedPeople() {
        printPersons(singleMale.meetCriteria(persons));
    }

    @Test
    public void find_singleOrfemale_returnsExpectedPeople() {
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    private void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
