package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description,double avgKmPerLitre,int cylinders){
        super(name,description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }
    public double getAvgKmPerLitre(){
        return avgKmPerLitre;
    }
    public int getCylinders(){
        return cylinders;
    }

    @Override
    public String startEngine(){
        return "Gasoline engine is started.";
    }

    @Override
    public String drive(){
        runEngine();
        return "Driving is possible for gas powered car.";
    }
    @Override
    protected void runEngine() {
        System.out.println(" Petrol engine running smoothly.");
    }
}
