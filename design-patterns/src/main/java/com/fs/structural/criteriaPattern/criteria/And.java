package com.fs.structural.criteriaPattern.criteria;

import com.fs.structural.criteriaPattern.Person;

import java.util.List;

public class And implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public And(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
