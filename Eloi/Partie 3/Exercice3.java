public class Exercice3 {
    public static void main (String[]args){
        int a=1;//variable1
        int b=6;//variable2
        char sim='+';//choix de calcul (+,-,*,/)
        switch (sim){
            case '+' : System.out.println("Réponce: "+ (a+b));break;
            case '-' : System.out.println("Réponce: "+ (a-b));break;
            case '*' : System.out.println("Réponce: "+ (a*b));break;
            case '/' : System.out.println("Réponce: "+ (a/b));break;
            default:System.out.println("*_* \n  c quoi sa?");
        }
    }
}
