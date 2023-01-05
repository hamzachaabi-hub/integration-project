package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//anotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Event")
public class Event {
    // Attributes
    @Id
    private int _id;
    private String picture;
    private String event_name;
    private String description;
}
