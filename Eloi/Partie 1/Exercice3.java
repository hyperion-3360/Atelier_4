public class Exercice3 {
    public static void main (String []args){
        float PrixInitial = 49.99f;//le prix initial
        float rabais = 0.20f;//le rabais (en % de 0 a 1)
        float prixrabais = (PrixInitial*(rabais/100));
        System.out.println("prix final: "+(PrixInitial-prixrabais));
    }
}