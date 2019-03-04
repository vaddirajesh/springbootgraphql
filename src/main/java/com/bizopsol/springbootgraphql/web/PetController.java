package com.bizopsol.springbootgraphql.web;

import com.bizopsol.springbootgraphql.domain.Person;
import com.bizopsol.springbootgraphql.domain.Pet;
import com.bizopsol.springbootgraphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PetController {

    @Autowired
    PersonService personService;

    @RequestMapping(value="/pets",method = RequestMethod.GET)
    public List<Pet> getPets(){
        return personService.getPets();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Person getPerson(@PathVariable("id")String id){
        return personService.personById(id);
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> getPeople(){
        return personService.getPeople();
    }

}
