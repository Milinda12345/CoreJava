public class Constructorchainig {


    Constructorchainig(int g){

        if (g>20 ){
            System.out.println("The total is greater than 20");

        }else {
            System.out.println("The total is less than 20");
        }

    }

    Constructorchainig(int c, int d){

        int e = c + d ;
        this(e);
    }
    Constructorchainig(int x, int y, int z){

        int a= x+y+z ;
        int b = x * y * z;
       this(a,b);
    }
}

