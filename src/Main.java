import MyLibrary.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        test(25, "Ciao");
        String str = test2(25, "Epicode");
        System.out.println(str);


        Scanner sc = new Scanner(System.in);

        // Soluzione con While
        /* while(true) {
            System.out.print("Inserisci un mese (1-12): ");
            int m = Integer.parseInt(sc.nextLine());
            String mese = getMese(m);
            System.out.println("Il mese è " + mese);

            System.out.print("Vuoi continuare? (s/n) ");
            String s = sc.nextLine();
            if(s.equals("n")) {
                break;
            }
        }*/

        // Soluzione con Do While
        /*do {
            System.out.print("Inserisci un mese (1-12): ");
            int m = Integer.parseInt(sc.nextLine());
            String mese = getMese(m);
            System.out.println("Il mese è " + mese);

            System.out.print("Vuoi continuare? (s/n) ");

        } while (sc.nextLine().equals("s"));
        */

        // Class
        Persona p1 = new Persona("Mario", "Rossi", 45);
        /*p1.nome = "Mario";
        p1.cognome = "Rossi";
        p1.eta = 45;*/

        Persona p2 = new Persona("Giuseppe", "Verdi", 22);
        /*p2.nome = "Giuseppe";
        p2.cognome = "Verdi";
        p2.eta = 22;*/

        Persona p3 = new Persona("Francesca", "Neri");

        p1.saluta();
        p2.saluta();
        p3.saluta();






    }

    // public private protected default
    public static void test(int x, String y) {
        // blocco di istruzioni
        System.out.println(y + " " + x);
    }

    public static String test2(int x, String y) {
        // blocco di istruzioni
        if(y.length() > 3 && y.length() <= 5){
            return y + " " + x;
        } else if (y.length() > 5) {
            return y + "!!!";
        } else {
            return "---";
        }
    }

    public static String getMese(int m) {
        String result;
        switch (m) {
            case 1: {
                result = "Gennaio";
                break;
            }
            case 3: {
                result = "Marzo";

                break;
            }
            case 8: {
                result = "Agosto";
                break;
            }
            default: {
                result = "Valore errato";
            }

        }
        return result;
    }

}