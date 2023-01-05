package com.example.demo.controller;


import com.example.demo.model.Event;
import com.example.demo.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

// Annotation
@RestController

public class EventController {
    @Autowired
    private EventRepo repo;

    @PostMapping("/addEvent")
    public String saveEvent(@RequestBody Event event){
        repo.save(event);

        return "Added Successfully";
    }

    @GetMapping("/findAllEvents")
    public List<Event> getEvents() {

        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);

        return "Deleted Successfully";
    }

}
