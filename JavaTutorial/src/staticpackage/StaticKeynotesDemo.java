package staticpackage;

public class StaticKeynotesDemo {

    public int addNum=11;
    public static int addNumStatic=10;

    public static void main(String args[]) {

        //static method cannot use the non-static variable or method directly
        // this and super cannot be used in static context

        StaticKeynotesDemo S1 = new StaticKeynotesDemo();
        int outputStatic= S1.sum(10);
        int output = sumStatic(22);
        System.out.println("Output is: " + output);
        System.out.println("OutputStatic is: " + outputStatic);

    }

    public int sum(int num){
       return num + addNum;
    }

    public static int sumStatic(int num){

        return num + addNumStatic;
    }
}
