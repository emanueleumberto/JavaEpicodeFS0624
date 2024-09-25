package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaPerimetro() {
        return (altezza + larghezza) * 2;
    }

    public double calcolaArea() {
        return this.altezza * this.larghezza;
    }

    public void stampaRettangolo() {
        System.out.println("Perimetro del rettangolo: " + this.calcolaPerimetro());
        System.out.println("Area del rettangolo: " + this.calcolaArea());
    }

}
