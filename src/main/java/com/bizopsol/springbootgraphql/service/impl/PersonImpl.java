package com.bizopsol.springbootgraphql.service.impl;

import com.bizopsol.springbootgraphql.domain.*;
import com.bizopsol.springbootgraphql.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class PersonImpl implements PersonService {

    public List<Person> getPeople(){
        Contact contact = Contact.builder().contactType(ContactType.EMAIL).info("rajesh.vaddi@foresee.com").build();
        Address address = Address.builder().address1("39977 Potrero Driver").city("Newark").state("California").country("USA").zipCode("94560").build();
        Person person = Person.builder()
                .id(UUID.randomUUID().toString())
                .firstName("Rajesh")
                .lastName("Vaddi")
                .address(address)
                .contact(contact)
                .build();
        return Arrays.asList(new Person[] {person});
    }

    public Person personById(String id){
        return getPeople().get(0);
    }

    @Override
    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<>();

        Pet aPet = new Pet();
        aPet.setId(1l);
        aPet.setName("Bill");
        aPet.setAge(9);
        aPet.setType(Animal.MAMMOTH);

        pets.add(aPet);

        return pets;
    }
}
