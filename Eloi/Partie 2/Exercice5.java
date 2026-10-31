public class Exercice5 {
    public static void main (String [] args){
        int année = 1900;//l'année choisit
        if ((année%4==0 && année%100!=0) || année%400==0) System.out.println("bissextile");
        else System.out.println("non bissextile");
    }
}
