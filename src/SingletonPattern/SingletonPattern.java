package SingletonPattern;

public class SingletonPattern {
    public static void implementSingletonPattern(){
        // Instance of the first object
        ExampleSingleton object1ExampleSingleton = ExampleSingleton.getInstance();

        // Instance of the second object
        ExampleSingleton object2ExampleSingleton = ExampleSingleton.getInstance();

        // we get the same object
        System.out.println(object1ExampleSingleton.getProp1());

        System.out.println(object2ExampleSingleton.getProp1());

        // Both objects are the same
        System.out.print(object1ExampleSingleton == object2ExampleSingleton);
    }
}

