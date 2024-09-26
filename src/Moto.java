import classi.Veicolo;

public class Moto extends Veicolo {
    public boolean portapacchi;

    public Moto(String marca, String modello, String targa, String cilindrata, boolean portapacchi) {
        super(marca, modello, targa, cilindrata);
        this.portapacchi = portapacchi;
    }

    public void test() {
        this.cilindrata = ""; // protected -> Classi o sottoClassi Nello stesso package o in package differenti
        this.marca = ""; // public -> Nello stesso package o in package differenti e su istanze
        // this.targa = ""; // package -> Classi o sottoClassi nello stesso package
    }

    public String getCilindrata() {
        return this.cilindrata;
    }

    @Override
    public void metodoAbs() {

    }

    @Override
    public String getInfo() {
        // System.out.println("Sono una Moto");
        return "Sono un Veicolo di tipo Moto";
        // return super.getInfo() + " di tipo Moto";
    }

    public void cambiaRuota() {
        System.out.println("Ruota sostituita");
    }



    @Override
    public String toString() {
        return super.toString() + " portapacchi=" + portapacchi;
    }
}
