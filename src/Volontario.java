import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Volontario implements CheckIn {

    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", cv='" + cv + '\'' +
                '}';
    }

    @Override
    public void checkIn(LocalDateTime orario) {
        System.out.println("Orario di lavoro: " + orario.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
