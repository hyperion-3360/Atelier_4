public class Exercice3 {
    public static void main (String[]args){
        int a = 0;//nombre 1
        int b = 1;//nombre 2
        int c = 0;//nombre 3
        if (a>b && a>c) System.out.println("a est plus grand");
        else if (b>a && b>c) System.out.println("b est le plus grand");
        else if (c>a && c>b) System.out.println("c est le plus grand");
        else System.out.println("Tout est egal");

    }
}
