package com.visitors.visitorapp.models.repository;

import com.visitors.visitorapp.models.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository<Building, Long> {

}
