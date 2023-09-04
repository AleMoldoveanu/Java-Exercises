package udemyExercise4;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        return "The "+ this.getClass().getSimpleName()+" engine is starting.";
    }

    public String accelerate(){
        return "The "+ this.getClass().getSimpleName()+" car is accelerating.";
    }

    public String brake(){
        return "The "+ this.getClass().getSimpleName()+" car is braking";
    }

}
