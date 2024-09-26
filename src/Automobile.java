import classi.Navigatore;
import classi.Veicolo;

public class Automobile extends Veicolo implements Navigatore {
    public boolean climatizzatore;

    public Automobile(String marca, String modello, String targa, String cilindrata, boolean climatizzatore) {
        super(marca, modello, targa, cilindrata);
        this.climatizzatore = climatizzatore;
    }

    @Override
    public void metodoAbs() {

    }

    @Override
    public String getInfo() {
        // System.out.println("Sono una Automobile");
        // return "Sono un Veicolo di tipo Automobile";
        return super.getInfo() + " di tipo Automobile";
    }

    //Overloading dei metodi
    public void getInfo(String str) {
        System.out.println("Sono una Automobile " + str);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void impostaMappa() {

    }

    @Override
    public void aggiorna() {

    }
}
