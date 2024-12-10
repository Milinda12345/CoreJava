public class Main implements sample{

    public static void main(String[] args) {
        Main obj = new Main();
        obj.test1();
        obj.test2();
        obj.test3();

        System.out.println(sample.x);

    }
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
    public void test3(){
        System.out.println("test3");
    }
}