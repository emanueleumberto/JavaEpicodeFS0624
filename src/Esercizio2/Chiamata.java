package Esercizio2;

public class Chiamata {

    private int durata;
    private String numeroChiamata;

    public Chiamata(int durata, String numeroChiamata) {
        this.durata = durata;
        this.numeroChiamata = numeroChiamata;
    }

    public String getNumeroChiamata() {
        return this.numeroChiamata;
    }

    public int getDurataChiamata() {
        return this.durata;
    }

}
