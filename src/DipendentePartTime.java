public class DipendentePartTime extends Dipendente {

    private double oreLavorate;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return this.getStipendio() * oreLavorate;
    }

}
