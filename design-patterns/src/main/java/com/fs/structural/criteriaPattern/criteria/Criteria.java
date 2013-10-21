package com.fs.structural.criteriaPattern.criteria;

import com.fs.structural.criteriaPattern.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
