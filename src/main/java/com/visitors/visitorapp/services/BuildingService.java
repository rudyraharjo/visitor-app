package com.visitors.visitorapp.services;

import com.visitors.visitorapp.models.entities.Building;
import com.visitors.visitorapp.models.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    public Building save(Building building){
        return buildingRepository.save(building);
    }

    public List<Building> getBuildings(){
        return buildingRepository.findAll();
    }

    public Building getBuilding(Long buildingId){
        Building building = buildingRepository.findById(buildingId)
                .orElseThrow(()-> new IllegalStateException(
                        "Bangunan dengan id " + buildingId + " Tidak terdaftar")
                );
        return building;
    }

    public void deleteBuilding(Long buildingId) {
        boolean exits = buildingRepository.existsById(buildingId);
        if(!exits) {
            throw new IllegalStateException("Bangunan dengan id "+ buildingId + " tidak di temukan");
        }
        buildingRepository.deleteById(buildingId);
    }
}
