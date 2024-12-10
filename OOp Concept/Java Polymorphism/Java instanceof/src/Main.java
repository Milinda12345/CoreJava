public class Main {
    public static void main(String[] args) {
        Dogs d1 = new Dogs() ;
        if (d1 instanceof Dogs){
            System.out.println("yes d1 is instance dogs");
        }
        else {
            System.out.println("no d1 is not instance dogs");
        }
        if (d1 instanceof Animals){
            System.out.println("yes d1 is instance Animals");
        }
        else {
            System.out.println("no d1 is not instance Animals");
        }
        boolean b = d1 instanceof Dogs ;
        System.out.println("b value: " + b);
    }
}
class Animals{
    void showData(){
        System.out.println("Animal class");
    }
}
class Dogs extends Animals{
    @Override
    void showData(){
        System.out.println("Dog class");
    }
}