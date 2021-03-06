package com.vinsguru.reactivemongo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "freelancers")
@ToString
@Builder
public class Freelancer {

    @Id
    private String id;
    private String name;
    private int age;
    private List<String> skills;

}
