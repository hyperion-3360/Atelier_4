public class Exercice1 {
    public static void main (String[]args){
        int i=1;
        for (i=1;i<=20;i++){
            if (i%7==0) break;
            System.out.println("test: "+i);
        }
        System.out.println("Réponce: "+i);
    }
}
