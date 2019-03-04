package com.bizopsol.springbootgraphql.resolvers;

import com.bizopsol.springbootgraphql.domain.Person;
import com.bizopsol.springbootgraphql.web.PetController;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonQuery implements GraphQLQueryResolver {

    @Autowired
    PetController petController;

    public List<Person> people(){
       return petController.getPeople();
    }

    public Person personById(String id){
        return petController.getPerson(id);
    }


}
