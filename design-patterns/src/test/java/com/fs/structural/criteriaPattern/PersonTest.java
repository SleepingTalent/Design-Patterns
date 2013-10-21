package com.fs.structural.criteriaPattern;

import com.fs.common.BaseUnitTest;
import com.fs.structural.criteriaPattern.criteria.*;
import org.junit.Assert;
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
        List<Person> actual = male.meetCriteria(persons);
        Assert.assertEquals(4, actual.size());
    }

    @Test
    public void find_females_returnsExpectedPeople() {
        List<Person> actual = female.meetCriteria(persons);
        Assert.assertEquals(2, actual.size());
    }

    @Test
    public void find_singlemales_returnsExpectedPeople() {
        List<Person> actual = singleMale.meetCriteria(persons);
        Assert.assertEquals(3, actual.size());
    }

    @Test
    public void find_singleOrfemale_returnsExpectedPeople() {
        List<Person> actual = singleOrFemale.meetCriteria(persons);
        Assert.assertEquals(5, actual.size());
    }
}
