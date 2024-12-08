public class Main {
    public static void main(String[] args) {
       B obj = new B() ;
        obj.Print();
        sample3 obj1 = new sample3();
        obj1.show();
        Kamal obj2 = new Kamal(15,"abcd ","sfsfsfs",75);
        System.out.println(obj2.marks);
    }   
    }
    class A{
        int x =10 ;
    }
    class B extends A {
        int x = 15 ;
        public void Print(){

            System.out.println(super.x);

        }
}
