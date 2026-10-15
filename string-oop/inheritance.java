public class inheritance{
    protected String brand="Generic";
    
    public void startEngine(){
        System.out.println("Engine started");
    }
}

public class Car extends inheritance {
    private int numberOfDoors;

    public Car(String brand, int doors){
        this.brand = brand;
        this.numberOfDoors=doors;
    }
}