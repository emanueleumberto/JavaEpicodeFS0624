import classi.Navigatore;
import classi.Veicolo;

public class Main {
    public static void main(String[] args) {

        AutoBerlina ab = new AutoBerlina("Fiat", "Panda", "AB123CD", "1000", true);
        // ab.getInfo();
        // ab.getInfo("Berlina");
        Moto m = new Moto("Honda", "Hornet", "12345", "800", true);
        // m.getInfo();
        // System.out.println(m.toString());
        // System.out.println(m);

        Camper c = new Camper("Laika", "ABC", "789456", "1900", 6);
        AutoBerlina a = new AutoBerlina("Fiat", "500", "AB456CD", "1000", false);
        Smartphone s = new Smartphone();

        Veicolo v = new AutoBerlina("Ford", "Fiesta", "ZN654CD", "1200", true);

        // Veicolo vi = new Veicolo("Ford", "Fiesta", "ZN654CD", "1200");

        Veicolo[] arr = new Veicolo[5];
        arr[0] = m;
        arr[1] = c;
        arr[2] = ab;
        arr[3] = a;
        arr[4] = v;


        // Moto moto = (Moto) arr[0];
        // arr[0].cambiaRuota(); Errore
        // moto.cambiaRuota();

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i].getInfo());
            arr[i].metodoAbs();
            System.out.println(arr[i]);
            if(arr[i] instanceof Moto) {
                //((Moto) arr[0]).cambiaRuota();
                Moto moto = (Moto) arr[i];
                moto.cambiaRuota();
            }
        }


        Navigatore[] arrNav = new Navigatore[3];
        arrNav[0] = ab;
        arrNav[1] = s;
        arrNav[2] = a;

        for(int i=0; i<arrNav.length; i++) {
            arrNav[i].aggiorna();
        }


    }
}