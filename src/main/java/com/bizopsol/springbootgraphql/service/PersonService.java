package com.bizopsol.springbootgraphql.service;

import com.bizopsol.springbootgraphql.domain.Person;
import com.bizopsol.springbootgraphql.domain.Pet;

import java.util.List;

public interface PersonService {
    List<Person> getPeople();
    Person personById(String id);
    List<Pet> getPets();
}
