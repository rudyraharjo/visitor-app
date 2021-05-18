package com.visitors.visitorapp.controllers;

import com.visitors.visitorapp.models.entities.Building;
import com.visitors.visitorapp.services.BuildingService;
import java.text.ParseException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/buildings")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping
    public List<Building> getBuildings(){
        return buildingService.getBuildings();
    }

    @SneakyThrows
    @PostMapping
    public Building save(@RequestBody Building building) {

//        SimpleDateFormat formatter = new SimpleDateFormat(
//                "HH:mm:ss");
//
//        Date d1 = formatter.parse(building.getTimevisit_f().toString());
//        Date d2 = formatter.parse(building.getTimevisit_t().toString());
//
//        long difference_In_Time
//                = d2.getTime() - d1.getTime();
//
//        long difference_In_Hours
//                = (difference_In_Time
//                / (1000 * 60 * 60))
//                % 24;
//
//        building.setTimevisit((int) difference_In_Hours);

        return buildingService.save(building);
        //return  building;
    }

    @GetMapping(path = "{buildingId}")
    public Building getBuilding(@PathVariable("buildingId") Long buildingId){
        return buildingService.getBuilding(buildingId);
    }

    @PutMapping
    public Building update(@RequestBody Building building){
        return buildingService.save(building);
    }

    @DeleteMapping(path = "{buildingId}")
    public void delete(@PathVariable("buildingId") Long buildingId)
    {
        buildingService.deleteBuilding(buildingId);
    }
}
