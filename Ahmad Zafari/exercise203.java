public class exercise203 {
    public static void main (String[]args){
        int a = 12;
        int b = 15;
        int c = 5;

        if (a > b && a > c){

            System.out.println("a has the biggest value among the other variables");

        }else if ( b > a && b > c){

            System.out.println("b has the biggest value");

        }else if ( c > a && c > a ){

            System.out.println("c has the biggest value");

        }else{

            System.out.println("you got somthing wrong in the code , you the one who wrote the code");
        }

    }
}
