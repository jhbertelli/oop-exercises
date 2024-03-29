package exercicio7;

import java.util.ArrayList;

import static javax.swing.JOptionPane.showConfirmDialog;

public class Paciente {
    private int age;
    private String name;
    private ArrayList<Consulta> appointmentHistory = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAppointment(Consulta appointment) {
        appointmentHistory.add(appointment);
    }

    public void showAppointments() {
        for (var appointment : appointmentHistory)
            showAppointment(appointment);
    }

    public void showAppointment(Consulta appointment) {
        Medico medic = appointment.getMedic();

        showConfirmDialog(
            null,
            String.format(
                "Médico: %s\nCRM: %s\nQueixas: %s\nData: %s\nMedicamentos prescrito: %s",
                medic.getName(),
                medic.getCrm(),
                appointment.getComplaints(),
                appointment.getDate(),
                appointment.getPrescribedMedicine()
            )
        );
    }
}