package SingletonPattern;

public class ExampleSingleton{ //lazy construction
    // the class variable is null if no instance is
    //instantiated
    private static ExampleSingleton uniqueInstance = null;

    private String prop1;

    private ExampleSingleton(){
        this.prop1 = "I'm the property 1";
    }

    // lazy construction of the instance
    public static ExampleSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }
    public String getProp1(){
        return prop1;
    }
}


