package oopsconcepts;

public class ConstructorDemo {

    public static void main(String args[]){

        Car2 c2 = new Car2();
        c2.setMake("Ford");
        System.out.println("Make is " + c2.getMake());
        System.out.println("Speed: " + c2.speed);
        System.out.println("Gear: "+ c2.gear);

        System.out.println("**************");

        Car2 c3= new Car2(10,1);
        System.out.println("c3 speed: " + c3.speed);
        System.out.println("c3 gear: "+ c3.gear);

    }
}
