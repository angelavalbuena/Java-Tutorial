package oopsconcepts;

public class ClassDemo {

    public static void main(String args[]){

        Car BMW = new Car(); // Create and initialize the object, con la varible BMW podemos obtener todos los métodos de la clase Car()
        BMW.setMake("BMW");
        System.out.println(BMW.getMake());

        Car Benz = new Car();
        Benz.setMake("Benz");
        System.out.println("Make is " + Benz.getMake());
        Benz.setModel("x1000");
        System.out.println("Model is " + Benz.getModel());
        Benz.setYear(2018);
        Benz.year=2017; // esto se puede hacer cuando la variable es pública
        System.out.println("Benz Year "+ Benz.getYear());



    }
}
