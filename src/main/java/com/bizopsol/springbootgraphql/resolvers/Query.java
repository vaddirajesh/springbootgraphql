package com.bizopsol.springbootgraphql.resolvers;

import com.bizopsol.springbootgraphql.domain.Pet;
import com.bizopsol.springbootgraphql.web.PetController;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    PetController petController;

    public List<Pet> pets() {
        return petController.getPets();
    }
}
