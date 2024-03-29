package exercicio7;

public class Consulta {
    private String date;
    private String complaints; // queixas
    private Medico medic;
    private String prescribedMedicine;

    public Consulta(String date, String complaints, Medico medic, String prescribedMedicine) {
        this.date = date;
        this.complaints = complaints;
        this.medic = medic;
        this.prescribedMedicine = prescribedMedicine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public void setPrescribedMedicine(String prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }

    public Medico getMedic() {
        return medic;
    }

    public void setMedic(Medico medic) {
        this.medic = medic;
    }
}
