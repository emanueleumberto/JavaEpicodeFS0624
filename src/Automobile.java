public class Automobile {

    private static int count = 0;
    private String marca;
    private String modello;
    private String targa;

    public Automobile(String marca, String modello, String targa) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        count++;
    }

    public void setTarga(String targa) {
        // controlli
        this.targa = targa;
    }

    public String info() {
        return "Auto: " + this.marca + " " + this.modello + " Targa: " + this.targa;
    }


    public String getTarga(){
        return this.targa;
    }

    public static int getCount() {
        return count;
    }

}
