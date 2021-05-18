package com.visitors.visitorapp.services;

import com.visitors.visitorapp.models.entities.Building;
import com.visitors.visitorapp.models.entities.Visitor;
import com.visitors.visitorapp.models.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorService {

    @Autowired
    private VisitorRepository visitorRepository;

    public List<Visitor> getVisitors(){
        return visitorRepository.findAll();
    }

    public Visitor save(Visitor visitor){
        return visitorRepository.save(visitor);
    }

    public Visitor getVisitor(Long visitorId){
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(()-> new IllegalStateException(
                        "Pengunjung dengan id " + visitorId + " Tidak terdaftar")
                );
        return visitor;
    }

}
