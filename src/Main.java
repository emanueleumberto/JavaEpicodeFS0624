public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String s = "Epicode";
        String f = s;
        f = "----";

        System.out.println(s);
        System.out.println(f);


        int x = 25;
        int y = x;
        y += 5;
        // x -> 25
        // y -> 30
        System.out.println(x);
        System.out.println(y);

        User u = new User("Mario Rossi", 25);
        System.out.println("Numero di User creati: " + User.count);
        User l = u;
        l.fullname = "Giuseppe Verdi";
        // l -> "Giuseppe Verdi 25"
        // u -> "Giuseppe Verdi 25"
        System.out.println(u.fullname);
        System.out.println(l.fullname);


        User o = new User("Mario Rossi", 25);
        System.out.println("Numero di User creati: " + User.count);
        System.out.println(o.fullname);
        o.setAge(99);
        // u.setAge(11);
        // o = null;
        System.out.println(o.fullname);

        User.getCount();


        int result = somma(4,9);
        int molt = result * 2;


        User g = new User("Mario Rossi", 25);
        System.out.println("Numero di User creati: " + User.count);



        Animal dog1 = new Animal("Bobby");
        dog1.specie = Specie.CANE;
        Animal dog2 = new Animal("Bobby");
        dog2.specie = Specie.GATTO;
        Animal dog3 = dog1;

        System.out.println("dog1 == dog2: "  + (dog1 == dog2));
        System.out.println("dog1.equals(dog2): " + dog1.equals(dog2));

        System.out.println("dog1 == dog3: "  + (dog1 == dog3));
        System.out.println("dog1.equals(dog3): " + dog1.equals(dog3));

        String str = "Abc";
        String txt = "Abc";

        System.out.println(str == txt);
        System.out.println(str.equals(txt));



        // Incapsulamento
        Automobile a1 = new Automobile("Fiat", "500", "AB123CD");
        // a1.modello = "Punto";
        // a1.marca = "Ferrari";
        // a1.targa = "DE678AB";
        a1.setTarga("DE678AB");
        // Automobile.count = 12589; // Errore
        System.out.println(Automobile.getCount());

    }

    public static int somma(int x, int y) {
        int s = x + y;
        return s;
    }

    public static void stampa(int val) {
        System.out.println("Il valore è " + val);
    }
}