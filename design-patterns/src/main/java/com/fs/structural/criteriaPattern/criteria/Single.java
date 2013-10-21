package com.fs.structural.criteriaPattern.criteria;

import com.fs.structural.criteriaPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class Single implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
