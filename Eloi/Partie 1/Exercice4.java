public class Exercice4 {
    public static void main (String []args){
        int x = 5;//nombre 1
        int y = 9;//nombre 2
        System.out.println("avant:"+x+","+y);
        int tempo = x;
        x=y;
        y=tempo;
        System.out.println("apres:"+x+","+y);

    }
}
