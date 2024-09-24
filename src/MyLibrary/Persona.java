package MyLibrary;

public class Persona {
    // Scope di istanza
    public String nome;
    public String cognome;
    public int eta;

    // Costruttore
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = 18;
    }

    public void saluta() {
        // Scope di metodo
        String abc = "Ciao";

        {
            // Scope di blocco
            String test = "Ciao";
        }


        System.out.println("Ciao sono " + this.nome + " " + this.cognome + " ho " + this.eta + " anni");
    }


}
