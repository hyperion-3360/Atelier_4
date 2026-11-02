public class Exercice6 {
    public static void main (String[]args){
       /*
       1.Partir
       2.Abandonner
       3.S'en aller
       4.Quitter
       */
        int choixmenu = 2;
        switch (choixmenu){
            case 1: System.out.println("Vous partez :("); break;
            case 2: System.out.println("Vous abandonner, c dommage."); break;
            case 3: System.out.println("bay bay."); break;
            case 4: System.out.println("Quitter"); break;
            default:System.out.println("UN CHOIX VALIDE!!!");
        }
    }
}
