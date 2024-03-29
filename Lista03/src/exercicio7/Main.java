package exercicio7;

import java.util.Date;

import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String[] args) {
        Paciente patient = new Paciente();

        setupDoctorWatsonAppointment(patient);
        setupDoctorBrownAppointment(patient);

        patient.showAppointments();
    }

    private static void setupDoctorWatsonAppointment(Paciente patient) {
        Medico doctorWatson = new Medico();

        doctorWatson.setName("Dr. Watson");
        doctorWatson.setCrm("07071852/EN");

        patient.addAppointment(
            new Consulta(
                new Date().toString(),
                "Dores de cabeça",
                doctorWatson,
                "Advil"
            )
        );
    }

    private static void setupDoctorBrownAppointment(Paciente patient) {
        Medico doctorBrown = new Medico();

        doctorBrown.setName("Dr. Emmett Brown");
        doctorBrown.setCrm("1234567/SC");

        patient.addAppointment(
            new Consulta(
                new Date().toString(),
                "Faringite, dor de garganta",
                doctorBrown,
                "Antibióticos"
            )
        );
    }
}