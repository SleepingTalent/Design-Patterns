package com.fs.structural.criteriaPattern.criteria;

import com.fs.structural.criteriaPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class Female implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
