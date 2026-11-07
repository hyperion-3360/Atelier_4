public class Exercice2 {
    public static void main (String[]args){
        //Boucle for
        System.out.println("===Boucle for===");
        for (int i=1;i<=5; i++){
            System.out.println(i);
        }
        //Boucle while
        System.out.println("===Boucle while===");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        //Boucle do-while
        System.out.println("===Boucle do-while===");
        i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}
