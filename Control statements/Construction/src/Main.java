public class Main {
    public static void main(String[] args) {

       DeafultConstructor obj1 = new DeafultConstructor();
       ParameterConstructor obj2 = new ParameterConstructor(10,20);
       Constructorchainig obj3 = new Constructorchainig(1,2,4);
       CopyConstructor obj4 = new CopyConstructor(1,"ravi") ;
       CopyConstructor obj5 = new CopyConstructor(obj4) ;
       System.out.println("Original object");
       obj4.Display();
       System.out.println("Copied object");
       obj5.Display();

    }
}



