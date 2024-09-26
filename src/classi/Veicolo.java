package classi;

public abstract class Veicolo {
    public String marca;
    private String modello;
    String targa;
    protected String cilindrata;

    public Veicolo(String marca, String modello, String targa, String cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }

    public abstract void metodoAbs();

    public String getInfo() {
        // System.out.println("Sono un Veicolo");
        return "Sono un Veicolo";
    }

    public final void testFinal() {
        System.out.println("Sono un metodo final");
    }

    @Override
    public String toString() {
        return "marca='" + marca + ", modello='" + modello + ", targa='" + targa + ", cilindrata='" + cilindrata;
    }
}
