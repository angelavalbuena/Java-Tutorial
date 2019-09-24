package exercise;

public class ReverseString {

    public static void main(String args[]) {

        String input =" This is a string ";
        String output = reverse(input);
        System.out.println("Result is: " + output);


    }

    private static String reverse(String input) {

        String reverse=" ";

        if(input.isEmpty() || input==null){
            System.out.println("Empty and null are strings are not accepted");
        }
        if (input.length()==1){

            reverse=input;
        }  else {

           String originalArray[] = input.split("\\s+");

           for( String item : originalArray){

               reverse = item + " " +reverse;

           }
        }

        return reverse.trim();
    }

}
