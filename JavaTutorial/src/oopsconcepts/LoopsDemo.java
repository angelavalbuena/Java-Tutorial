package oopsconcepts;

public class LoopsDemo {

    public static void main(String args[]) {

         // for ( initialization; boolean_expresion; update

        for(int i=0; i<20; i++){

            System.out.println("The value of i: " + i);
        }


        int [] numbers ={10,20,30};

        for(int i=0; i <numbers.length ;i++){

            System.out.println("The value of number is " + i + " is: "+ numbers[i]);
        }



        for (int number: numbers){
            System.out.println("numbers: " + number);

        }

        String [] car ={"bmw", "audi", "ford", "mazda"};

        for(String cars: car){

            System.out.println("Car is: " + cars);
        }
    }
}
