import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new DipendenteFullTime(1001, 1500.00, Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime(1002, 10, Dipartimento.VENDITE, 80);
        Dipendente d3 = new Dirigente(1003, 2500.00, Dipartimento.AMMINISTRAZIONE, 147);

        /*Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = d1;
        dipendenti[1] = d2;
        dipendenti[2] = d3;
        */

        Dipendente[] dipendenti = {d1, d2, d3};
        for (Dipendente d : dipendenti) {
            System.out.println(d + " Stipendio: " + d.calculateSalary());
        }

        Volontario v = new Volontario("Mario", 25, "cv");
        CheckIn[] arr = {d1, d2, d3, v};
        for (CheckIn d : arr) {
            d.checkIn(LocalDateTime.now());
        }



    }
}