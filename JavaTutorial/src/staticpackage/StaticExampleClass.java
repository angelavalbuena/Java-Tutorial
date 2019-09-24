package staticpackage;

public class StaticExampleClass {

    private String make;
    private static int instanceNum=0;

    public StaticExampleClass(String make){ // Constructor

        this.make=make;
        instanceNum++;
    }

    public String getMake(){

        return make;
    }

    public static int getInstanceNum(){ // al cambiar el mètodo a static no es necesario crear el objeto, solo puede usar variables estaticas
        return instanceNum;
    }

}
