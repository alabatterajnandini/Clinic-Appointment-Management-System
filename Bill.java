import java.io.Serializable;

public class Bill implements Serializable {
    private int id;
    private int patientId;
    private double consultation;
    private double medicine;
    private double test;
    private double total;

    public Bill(int id, int patientId, double consultation,
                double medicine, double test, double total) {
        this.id = id;
        this.patientId = patientId;
        this.consultation = consultation;
        this.medicine = medicine;
        this.test = test;
        this.total = total;
    }

    public int getId() { return id; }
    public int getPatientId() { return patientId; }
    public double getConsultation() { return consultation; }
    public double getMedicine() { return medicine; }
    public double getTest() { return test; }
    public double getTotal() { return total; }
}