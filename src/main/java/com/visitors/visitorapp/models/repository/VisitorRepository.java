package com.visitors.visitorapp.models.repository;

import com.visitors.visitorapp.models.entities.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
}
