package oopsconcepts;

public class Car2 {

    private String make;
    int speed;
    int gear;

    public Car2(){ // Constructor

        speed=0;
        gear=1;

        System.out.println("Executing constructor without arguments");
    }

    public Car2(int speed, int gear){

        this.speed=speed;
        this.gear=gear;

        System.out.println("Executing constructor with arguments");

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }


}
