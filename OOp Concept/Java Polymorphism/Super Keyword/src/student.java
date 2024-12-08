public class student {
    int x ; String school ; String email ;

    public student() {
        // Default constructor
    }

    public student(int x , String school , String email){

        this.x = x ; this.email = email ; this.school = school ;

    }
}
class Kamal extends student{

    int marks ;
    Kamal(int x , String school , String email , int marks) {
        super(x,school,email);
        this.marks = marks ;

    }
}