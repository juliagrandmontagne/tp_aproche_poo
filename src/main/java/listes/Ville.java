package listes;

public class Ville {
    String Nom;
    double NombreHabitants;

    public Ville(String nom, double nombreHabitants) {
        Nom = nom;
        NombreHabitants = nombreHabitants;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public double getNombreHabitants() {
        return NombreHabitants;
    }

    public void setNombreHabitants(double nombreHabitants) {
        NombreHabitants = nombreHabitants;
    }
}
