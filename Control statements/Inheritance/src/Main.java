public class Main {
    public static void main(String[] args) {
    oldphone obj1 = new oldphone() ;
    newphone obj2 = new newphone() ;
    latesphone obj3 = new latesphone() ;
    }

    public static class oldphone{

        String name;
        void call(){

        }
        void message(){

        }
    }
    public static class newphone extends oldphone{
        void internet(){

        }
    }
    public static class latesphone extends newphone{
            void camer() {

}
    }
}