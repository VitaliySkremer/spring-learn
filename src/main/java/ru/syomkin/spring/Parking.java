package ru.syomkin.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Parking {
    private final List<Vehicle> vehicleList;
    private final Map<String, Vehicle> vehicleMap;

    @Autowired
    public Parking(List<Vehicle> vehicleList, Map<String, Vehicle> vehicleMap) {
        this.vehicleList = vehicleList;
        this.vehicleMap = vehicleMap;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public Map<String, Vehicle> getVehicleMap() {
        return vehicleMap;
    }
}
