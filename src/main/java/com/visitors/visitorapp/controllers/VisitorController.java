package com.visitors.visitorapp.controllers;

import com.visitors.visitorapp.models.entities.Building;
import com.visitors.visitorapp.models.entities.Visitor;
import com.visitors.visitorapp.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @GetMapping
    public List<Visitor> getVisitors(){
        return visitorService.getVisitors();
    }

    @PostMapping
    public Visitor save(@RequestBody Visitor visitor){
        return visitorService.save(visitor);
    }

    @GetMapping(path = "{visitorId}")
    public Visitor getVisitor(@PathVariable("visitorId") Long visitorId){
        return visitorService.getVisitor(visitorId);
    }
}
