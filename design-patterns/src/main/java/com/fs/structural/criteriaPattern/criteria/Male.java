package com.fs.structural.criteriaPattern.criteria;

import com.fs.structural.criteriaPattern.Person;

import java.util.ArrayList;
import java.util.List;

public class Male implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
