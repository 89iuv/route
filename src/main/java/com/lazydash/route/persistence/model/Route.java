package com.lazydash.route.persistence.model;

/**
 * Created by VUveges on 10/25/2016.
 */
public class Route {
    private String locations;
    private double distance;
    private String instructions;

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}