public class Exercice2 {
    public static void main (String[]args){
        int mois=13;//no du mois (1 a 12)
        if (mois==12 || mois==1 || mois==2) mois=1;
        else if (mois==3 || mois==4 || mois==5) mois=2;
        else if (mois==6 || mois==7 || mois==8) mois=3;
        else if (mois==9 || mois==10 || mois==11)mois=4;
        else System.out.println("Depuis quand sa existe?");
        switch (mois){
            case 1:System.out.println("Hiver"); break;
            case 2:System.out.println("Printemps"); break;
            case 3:System.out.println("été"); break;
            case 4:System.out.println("Automne"); break;
        }
    }
}
