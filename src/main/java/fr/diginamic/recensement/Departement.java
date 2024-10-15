package fr.diginamic.recensement;

public class Departement {
    int NumeroDeDepartement;
    int nombreTotalHabitant;

    public Departement(int nombreTotalHabitant, int numeroDeDepartement) {
        this.nombreTotalHabitant = nombreTotalHabitant;
        NumeroDeDepartement = numeroDeDepartement;
    }

    public int getNumeroDeDepartement() {
        return NumeroDeDepartement;
    }

    public void setNumeroDeDepartement(int numeroDeDepartement) {
        NumeroDeDepartement = numeroDeDepartement;
    }

    public int getNombreTotalHabitant() {
        return nombreTotalHabitant;
    }

    public void setNombreTotalHabitant(int nombreTotalHabitant) {
        this.nombreTotalHabitant = nombreTotalHabitant;
    }
}
