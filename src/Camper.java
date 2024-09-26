import classi.Veicolo;

public class Camper extends Veicolo {
    public  int postiLetto;

    public Camper(String marca, String modello, String targa, String cilindrata, int postiLetto) {
        super(marca, modello, targa, cilindrata);
        this.postiLetto = postiLetto;
    }


    @Override
    public void metodoAbs() {

    }

    @Override
    public String getInfo() {
        // System.out.println("Sono un Camper");
        // return "Sono un Veicolo di tipo Camper";
        return super.getInfo() + " di tipo Camper";
    }


    /*
     Un metodo final snon può essere sovrascritto
     public void testFinal() {
        System.out.println("Sono un metodo final sovrascritto");
    }
    */

}
