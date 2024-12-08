public class InitializationBlock {

    {
        System.out.println("InitializationBlock 1");
    }
    static {
        System.out.println("Static Blocks 1");
    }
    {
        System.out.println("InitializationBlock");
    }
    static {
        System.out.println("Static Blocks 2");
    }
}
