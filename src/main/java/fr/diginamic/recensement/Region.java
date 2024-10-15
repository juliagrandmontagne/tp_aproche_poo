package fr.diginamic.recensement;
public class Region {
    int numeroDeRegion;
    int nombreTotalHabitant;

    public Region(int numeroDeRegion, int nombreTotalHabitant) {
        this.numeroDeRegion = numeroDeRegion;
        this.nombreTotalHabitant = nombreTotalHabitant;
    }

    public int getNumeroDeRegion() {
        return numeroDeRegion;
    }

    public void setNumeroDeRegion(int numeroDeRegion) {
        this.numeroDeRegion = numeroDeRegion;
    }

    public int getNombreTotalHabitant() {
        return nombreTotalHabitant;
    }

    public void setNombreTotalHabitant(int nombreTotalHabitant) {
        this.nombreTotalHabitant = nombreTotalHabitant;
    }
}
