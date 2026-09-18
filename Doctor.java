import java.io.Serializable;

public class Doctor implements Serializable {
    private int id;
    private String name;
    private String specialization;
    private String phone;

    public Doctor(int id, String name, String specialization, String phone) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return "Doctor ID: " + id
                + ", Name: " + name
                + ", Specialization: " + specialization
                + ", Phone: " + phone;
    }
}