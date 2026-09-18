import java.io.Serializable;

public class Patient implements Serializable {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String problem;

    public Patient(int id, String name, int age, String gender, String phone, String problem) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.problem = problem;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getProblem() { return problem; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setProblem(String problem) { this.problem = problem; }

    @Override
    public String toString() {
        return "Patient ID: " + id
                + ", Name: " + name
                + ", Age: " + age
                + ", Gender: " + gender
                + ", Phone: " + phone
                + ", Problem: " + problem;
    }
}