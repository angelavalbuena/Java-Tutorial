package oopsconcepts;

public class WhileDemo {

    public static void main(String args[]){
        
      int i=10;

      boolean condition = 10 <20;
        System.out.println("Condition: " + condition);


    /*  while(i<20){
          // i++;
          if(i==17){
              continue; // finish
          }
          System.out.println("i " + i);

          i++;
        }
        System.out.println("outside loop");
    */

       do{
           System.out.println("i "+i);
            i++;
       } while (i<20);
    }

}
