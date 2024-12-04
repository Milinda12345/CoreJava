public class CopyConstructor {
int id ;
String name ;
CopyConstructor(int id, String name) {
this.id = id ;
this.name = name ;
}
CopyConstructor(CopyConstructor ct) {

    this.id = ct.id;
    this.name = ct.name;

}

void Display() {

    System.out.println(id + " " + name);
}

}
