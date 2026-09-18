import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();
    private static final ArrayList<Appointment> appointments = new ArrayList<>();
    private static final ArrayList<Bill> bills = new ArrayList<>();

    private static final String DATA_FILE = "clinic_data.dat";

    public static void main(String[] args) {
        loadData();

        while (true) {
            System.out.println("\n======================================");
            System.out.println(" CLINIC APPOINTMENT MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Appointment Management");
            System.out.println("4. Billing Management");
            System.out.println("5. Reports");
            System.out.println("6. Save Data");
            System.out.println("0. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> patientMenu();
                case 2 -> doctorMenu();
                case 3 -> appointmentMenu();
                case 4 -> billingMenu();
                case 5 -> reportMenu();
                case 6 -> {
                    saveData();
                    System.out.println("Data saved successfully.");
                }
                case 0 -> {
                    saveData();
                    System.out.println("Thank you for using the system.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void patientMenu() {
        while (true) {
            System.out.println("\n--- Patient Management ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("0. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> viewPatients();
                case 3 -> searchPatient();
                case 4 -> updatePatient();
                case 5 -> deletePatient();
                case 0 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addPatient() {
        int id = getNextPatientId();
        String name = readText("Enter patient name: ");
        int age = readInt("Enter age: ");
        String gender = readText("Enter gender: ");
        String phone = readText("Enter phone number: ");
        String problem = readText("Enter health problem: ");

        patients.add(new Patient(id, name, age, gender, phone, problem));
        saveData();
        System.out.println("Patient added successfully. Patient ID: " + id);
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
            return;
        }

        System.out.println("\n--- Patient List ---");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    private static void searchPatient() {
        String keyword = readText("Enter patient ID or name: ").toLowerCase();

        boolean found = false;
        for (Patient p : patients) {
            if (String.valueOf(p.getId()).equals(keyword)
                    || p.getName().toLowerCase().contains(keyword)) {
                System.out.println(p);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Patient not found.");
        }
    }

    private static void updatePatient() {
        int id = readInt("Enter patient ID to update: ");
        Patient patient = findPatient(id);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        String phone = readText("Enter new phone number: ");
        String problem = readText("Enter new health problem: ");

        patient.setPhone(phone);
        patient.setProblem(problem);

        saveData();
        System.out.println("Patient updated successfully.");
    }

    private static void deletePatient() {
        int id = readInt("Enter patient ID to delete: ");
        Patient patient = findPatient(id);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        patients.remove(patient);
        saveData();
        System.out.println("Patient deleted successfully.");
    }

    private static void doctorMenu() {
        while (true) {
            System.out.println("\n--- Doctor Management ---");
            System.out.println("1. Add Doctor");
            System.out.println("2. View All Doctors");
            System.out.println("3. Search Doctor");
            System.out.println("4. Delete Doctor");
            System.out.println("0. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> viewDoctors();
                case 3 -> searchDoctor();
                case 4 -> deleteDoctor();
                case 0 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addDoctor() {
        int id = getNextDoctorId();
        String name = readText("Enter doctor name: ");
        String specialization = readText("Enter specialization: ");
        String phone = readText("Enter phone number: ");

        doctors.add(new Doctor(id, name, specialization, phone));
        saveData();
        System.out.println("Doctor added successfully. Doctor ID: " + id);
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
            return;
        }

        System.out.println("\n--- Doctor List ---");
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    private static void searchDoctor() {
        String keyword = readText("Enter doctor ID or name/specialization: ").toLowerCase();

        boolean found = false;
        for (Doctor d : doctors) {
            if (String.valueOf(d.getId()).equals(keyword)
                    || d.getName().toLowerCase().contains(keyword)
                    || d.getSpecialization().toLowerCase().contains(keyword)) {
                System.out.println(d);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Doctor not found.");
        }
    }

    private static void deleteDoctor() {
        int id = readInt("Enter doctor ID to delete: ");
        Doctor doctor = findDoctor(id);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        doctors.remove(doctor);
        saveData();
        System.out.println("Doctor deleted successfully.");
    }

    private static void appointmentMenu() {
        while (true) {
            System.out.println("\n--- Appointment Management ---");
            System.out.println("1. Book Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Cancel Appointment");
            System.out.println("0. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> bookAppointment();
                case 2 -> viewAppointments();
                case 3 -> cancelAppointment();
                case 0 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void bookAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Please add at least one patient and one doctor first.");
            return;
        }

        int patientId = readInt("Enter patient ID: ");
        Patient patient = findPatient(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        int doctorId = readInt("Enter doctor ID: ");
        Doctor doctor = findDoctor(doctorId);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        LocalDate date = readDate("Enter appointment date (YYYY-MM-DD): ");
        LocalTime time = readTime("Enter appointment time (HH:MM): ");

        for (Appointment a : appointments) {
            if (a.getDoctorId() == doctorId
                    && a.getDate().equals(date)
                    && a.getTime().equals(time)
                    && a.getStatus().equals("Booked")) {
                System.out.println("This doctor already has an appointment at that time.");
                return;
            }
        }

        int id = getNextAppointmentId();
        appointments.add(new Appointment(
                id, patientId, doctorId, date, time, "Booked"
        ));

        saveData();
        System.out.println("Appointment booked successfully. Appointment ID: " + id);
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        System.out.println("\n--- Appointment List ---");
        for (Appointment a : appointments) {
            Patient p = findPatient(a.getPatientId());
            Doctor d = findDoctor(a.getDoctorId());

            String patientName = p == null ? "Unknown" : p.getName();
            String doctorName = d == null ? "Unknown" : d.getName();

            System.out.println(
                    "Appointment ID: " + a.getId()
                    + ", Patient: " + patientName
                    + ", Doctor: " + doctorName
                    + ", Date: " + a.getDate()
                    + ", Time: " + a.getTime()
                    + ", Status: " + a.getStatus()
            );
        }
    }

    private static void cancelAppointment() {
        int id = readInt("Enter appointment ID to cancel: ");

        for (Appointment a : appointments) {
            if (a.getId() == id) {
                a.setStatus("Cancelled");
                saveData();
                System.out.println("Appointment cancelled successfully.");
                return;
            }
        }

        System.out.println("Appointment not found.");
    }

    private static void billingMenu() {
        while (true) {
            System.out.println("\n--- Billing Management ---");
            System.out.println("1. Generate Bill");
            System.out.println("2. View Bills");
            System.out.println("0. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1 -> generateBill();
                case 2 -> viewBills();
                case 0 -> { return; }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void generateBill() {
        int patientId = readInt("Enter patient ID: ");
        Patient patient = findPatient(patientId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        double consultation = readDouble("Enter consultation fee: ");
        double medicine = readDouble("Enter medicine fee: ");
        double test = readDouble("Enter test fee: ");

        double total = consultation + medicine + test;
        int id = getNextBillId();

        bills.add(new Bill(id, patientId, consultation, medicine, test, total));
        saveData();

        System.out.println("Bill generated successfully.");
        System.out.println("Bill ID: " + id);
        System.out.println("Total Amount: Rs. " + total);
    }

    private static void viewBills() {
        if (bills.isEmpty()) {
            System.out.println("No bills found.");
            return;
        }

        System.out.println("\n--- Bills ---");
        for (Bill b : bills) {
            Patient p = findPatient(b.getPatientId());
            String patientName = p == null ? "Unknown" : p.getName();

            System.out.println(
                    "Bill ID: " + b.getId()
                    + ", Patient: " + patientName
                    + ", Consultation: Rs. " + b.getConsultation()
                    + ", Medicine: Rs. " + b.getMedicine()
                    + ", Test: Rs. " + b.getTest()
                    + ", Total: Rs. " + b.getTotal()
            );
        }
    }

    private static void reportMenu() {
        System.out.println("\n--- Reports ---");
        System.out.println("Total Patients: " + patients.size());
        System.out.println("Total Doctors: " + doctors.size());
        System.out.println("Total Appointments: " + appointments.size());
        System.out.println("Total Bills: " + bills.size());

        long booked = appointments.stream()
                .filter(a -> a.getStatus().equals("Booked"))
                .count();

        long cancelled = appointments.stream()
                .filter(a -> a.getStatus().equals("Cancelled"))
                .count();

        System.out.println("Booked Appointments: " + booked);
        System.out.println("Cancelled Appointments: " + cancelled);
    }

    private static Patient findPatient(int id) {
        for (Patient p : patients) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private static Doctor findDoctor(int id) {
        for (Doctor d : doctors) {
            if (d.getId() == id) return d;
        }
        return null;
    }

    private static int getNextPatientId() {
        return patients.stream().mapToInt(Patient::getId).max().orElse(0) + 1;
    }

    private static int getNextDoctorId() {
        return doctors.stream().mapToInt(Doctor::getId).max().orElse(0) + 1;
    }

    private static int getNextAppointmentId() {
        return appointments.stream().mapToInt(Appointment::getId).max().orElse(0) + 1;
    }

    private static int getNextBillId() {
        return bills.stream().mapToInt(Bill::getId).max().orElse(0) + 1;
    }

    private static String readText(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid amount.");
            }
        }
    }

    private static LocalDate readDate(String message) {
        while (true) {
            try {
                System.out.print(message);
                return LocalDate.parse(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Use date format YYYY-MM-DD.");
            }
        }
    }

    private static LocalTime readTime(String message) {
        while (true) {
            try {
                System.out.print(message);
                return LocalTime.parse(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Use time format HH:MM, for example 10:30.");
            }
        }
    }

    private static void saveData() {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            out.writeObject(patients);
            out.writeObject(doctors);
            out.writeObject(appointments);
            out.writeObject(bills);
        } catch (IOException e) {
            System.out.println("Unable to save data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadData() {
        File file = new File(DATA_FILE);

        if (!file.exists()) return;

        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(file))) {
            patients.addAll((ArrayList<Patient>) in.readObject());
            doctors.addAll((ArrayList<Doctor>) in.readObject());
            appointments.addAll((ArrayList<Appointment>) in.readObject());
            bills.addAll((ArrayList<Bill>) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Previous data could not be loaded.");
        }
    }
}