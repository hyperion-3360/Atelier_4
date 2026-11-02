public class exercise104{

    public static void main(String[]args){
        int x = 5;
        int y = 9;
        
        //Before chenge
        System.out.println("Before change/swap");
        System.out.println(x);
        System.out.println(y);

        //After swap 
        int b = x;
        x = y;
        y = b;
        System.out.println("After change/swap");
        System.out.println(x);
        System.out.println(y);

    }
}