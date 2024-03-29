package oopsconcepts;

public class Car {
    // variable
    private String make;
    // model
    private String model;
    // color
    private String color;
    // year
    public int year; //

    public void increaseSpeed() {
        System.out.println("Increasing the speed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1900)
        {
            this.year = year;
        }
        else{
            System.out.println("This year is not valid ");
        }

    }

}
