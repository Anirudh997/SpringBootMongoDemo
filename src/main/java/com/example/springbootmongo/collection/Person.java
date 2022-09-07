package com.example.springbootmongo.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "person") //Confirms this Calss as an Entity.. Similar to @Entity
@JsonInclude(JsonInclude.Include.NON_NULL) //Whatever fields are non null will be stored in DB
public class Person {

    @Id
    private String personId;
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String> hobbie;
    private List<Address> addresses;
}
