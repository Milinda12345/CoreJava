// Remove 'public' from class sample3 to resolve the error
public class sample2 {

    void show(){
        System.out.println("hi");
    }
}
class sample3 extends sample2{
    void show() {
        super.show();
        System.out.println("hello");
    }

}
