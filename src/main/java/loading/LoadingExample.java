package loading;

public class LoadingExample {
    public static final int STATIC_FIELD = Main.staticField();
    public static final int STATIC_FIELD_INITIALIZER;
    static{

        STATIC_FIELD_INITIALIZER = Main.staticInitializer();
    }

    private final int objectField = Main.objectField();

    private final int objectInitializer;

    {
        objectInitializer = Main.objectInitializer();
    }

    private int firstConstructor;
    private int secondConstructor;

                public LoadingExample(){
        this (1);
        firstConstructor = Main.firstConstructor();
    }

    public LoadingExample (int x){
        secondConstructor = Main.secondConstructor();

    }
}
