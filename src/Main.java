import Esercizio1.Rettangolo;
import Esercizio2.Sim;

public class Main {
    public static void main(String[] args) {

        // Esercizio 1
        Rettangolo r1 = new Rettangolo(10, 5);
        Rettangolo r2 = new Rettangolo(20, 3);
        // r1.stampaRettangolo();
        // stampaRettangolo(r1);
        // stampaDueRettangoli(r1, r2);

        // Esercizio 2
        Sim s1 = new Sim("0321.123456789");
        s1.ricaricaSim(10);
        s1.chiamaNumero("123456789", 2);
        s1.chiamaNumero("987654321", 4);
        s1.stampaDatiSim();
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("Perimetro del rettangolo: " + r.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + r.calcolaArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        // r1.stampaRettangolo();
        // r2.stampaRettangolo();
        stampaRettangolo(r1);
        stampaRettangolo(r2);

        double sommaPerimetro = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        double sommaArea = r1.calcolaArea() + r2.calcolaArea();

        System.out.println("La somma dei perimetri: " + sommaPerimetro);
        System.out.println("La somma delle aree: " + sommaArea);
    }
}