public class Exercice5 {
    public static void main (String[]args){
        int jour=4;//jour (1 a 7)
        switch(jour){// pas de break pour laisser passer
            //semaine
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :System.out.println("Jour de semaine"); break;
            //fin de semaine
            case 6 :
            case 7 :System.out.println("fin de semaine"); break;
            //si c pas valide
            default: System.out.println("Apprend tes jours de la semaine: https://youtu.be/dQw4w9WgXcQ?si=sXV5YSEE-7mXXoez");
        }
    }
}
