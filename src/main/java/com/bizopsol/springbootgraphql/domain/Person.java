package com.bizopsol.springbootgraphql.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Address address;
    private Contact contact;
}
