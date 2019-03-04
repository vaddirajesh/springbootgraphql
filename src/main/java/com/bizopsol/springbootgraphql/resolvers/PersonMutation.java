package com.bizopsol.springbootgraphql.resolvers;

import com.bizopsol.springbootgraphql.domain.Person;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersonMutation implements GraphQLMutationResolver {


    public Person createPerson(Person person){
        person.setId(UUID.randomUUID().toString());
        return person;
    }
}
