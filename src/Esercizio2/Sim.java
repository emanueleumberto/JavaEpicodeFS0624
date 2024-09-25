package Esercizio2;

public class Sim {

    private String numero;
    private double credito;
    private Chiamata[] chiamate;
    private double costoMinuto = 0.20;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void stampaDatiSim() {
        System.out.println("Sim numero: " + this.numero);
        System.out.println("Credito: " + this.credito);
        System.out.println("Lista Chiamate: ");
        for(int i=0; i<this.chiamate.length; i++) {
            if(this.chiamate[i] != null) {
                System.out.println("     - " + this.chiamate[i].getNumeroChiamata() );
            }
        }

    }

    public void ricaricaSim(double credito) {
        this.credito += credito;
    }

    public void chiamaNumero(String numeroChiamato, int durata) {

        if(this.credito > 0) {
            Chiamata c = new Chiamata(durata, numeroChiamato);
            double costoChiamata = durata * costoMinuto;
            this.credito -= costoChiamata;

            for (int i = 0; i < this.chiamate.length; i++) {
                if (this.chiamate[i] == null) {
                    this.chiamate[i] = c;
                    break;
                }
            }
        }
    }
}
