public class Exercice2 {
    public static void main (String[]args){
        int mois=13;//no du mois (1 a 12)
        switch (mois){
            case 1,2,12: System.out.println("Hiver"); break;
            case 3,4,5:System.out.println("Printemps"); break;
            case 6,7,8:System.out.println("été"); break;
            case 9,10,11:System.out.println("Automne"); break;
            default:System.out.println("c pas un mois");
        }
    }
}