public class Exercice4 {
    public static void main (String []args){
        char note='F';//La note optonu (A,B,C,D,E,F)
        String hihihi = "La note F est une véritable catastrophe !\nÀ ce stade, ce n'est même plus un travail manqué, c'est un désastre complet.\nRien ne va, aucune consigne n'est respectée et le niveau est absolument au plus bas.\nMême ma tortue ferait mieux en marchant sur le clavier avec les yeux fermés !\nC'est un naufrage total, du premier au dernier mot.\nChaque ligne est une nouvelle erreur et on se demande si le cours a été suivi un seul instant.\nContinuer dans cette direction est tout simplement impossible.\nIl faut tout effacer, tout jeter à la poubelle et tout reprendre depuis zéro immédiatement !";
        switch (note){
            case 'A': System.out.println("Exellent !");break;
            case 'B': System.out.println("Très bien!");break;
            case 'C':System.out.println("Bien");break;
            case 'D': System.out.println("Passable");break;
            case 'F': System.out.println(hihihi);break;
            default: System.out.println("Je te jure si c plus bas que F tu es dans le caca");
        }
    }
}
