package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private  int batterySize;
    public  ElectricCar(String name, String description,double vgKmPerCharge, int batterySize){
        super(name,description);
        this.avgKmPerCharge=vgKmPerCharge;
        this.batterySize=batterySize;
    }
    public  double getAvgKmPerCharge(){
        return avgKmPerCharge;
    }
    public int getBatterySize(){
        return batterySize;
    }

    @Override
    public String startEngine(){
        return "Electric engine is started.";
    }

    @Override
    public String drive(){
        runEngine();
        return "Driving is possible for electric car.";
    }
    @Override
    protected void runEngine() {
        System.out.println(" Electric engine running smoothly.");
    }
}
