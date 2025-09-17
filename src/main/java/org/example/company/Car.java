package org.example.company;

public class Car {
    private boolean engine;
    private  int cylinders;
    private  String name;
    private  int wheels;

   public Car(int cylinders, String name){
        this.name=name;
        this.cylinders=cylinders;
        this.engine=true;
        this.wheels=4;
    }
    public String getName(){
        return  name;
    }
    public  Integer getCylinders(){
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{ name= '" + name + "' , cylinders=" + cylinders + ", engine =" + engine + ", wheels=" + wheels + "}";
    }

        @Override public boolean equals(Object object) {
      if (this == object) return true;
      if (object == null || getClass() != object.getClass()) return false;

      Car car = (Car) object;
      return cylinders == car.cylinders && (name != null ? name.equals(car.name) : car.name == null);
        }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
    }

