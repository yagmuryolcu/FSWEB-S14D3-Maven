package org.example.arge;

import org.example.company.Car;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String startEngine(){
        return "Engine is started.";
    }

    public String drive(){
        runEngine();
        return "Driving is possible.";
    }
    protected void runEngine(){
        System.out.println("Engine is running.");
    }

}
