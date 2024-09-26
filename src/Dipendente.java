import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Dipendente implements CheckIn {

    private final int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn(LocalDateTime orario) {
        System.out.println("Orario di lavoro: " + orario.format(DateTimeFormatter.ISO_DATE_TIME));
    }

    @Override
    public String toString() {
        return "Dipendente matricola=" + matricola +
                ", dipartimento=" + dipartimento;
    }
}
