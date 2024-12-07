public class Main {
    public static void main(String[] args) {
        int id ;
        String name ;
        Address address ;

        Address add1 = new Address("srilanka" , "habarakad" , "colombo") ;



    }
    static class Address{
        int id ;
        String name ;
        String city ,state , country ;

        public Address(String name , String state , String country){
            this.city = city ;
            this.state = state ;
            this.country = country ;

        }

        public class Emp {
            int id;
            String name;
            Address address;

        public Emp(int id, String name, Address address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }

        }
        void  display(){

            System.out.println("Id: " + id + ", Name: " + name);
            System.out.println(city + " " + state + " " + country);
        }
    }
}