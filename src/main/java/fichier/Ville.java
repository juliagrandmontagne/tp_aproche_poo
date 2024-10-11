package fichier;

public class Ville {
    String nom;
    String CodeDepartement;
    String NomDelaRegion;
    int PopulationTotale;

    public Ville(String nom, String codeDepartement, String nomDelaRegion, int populationTotale) {
        this.nom = nom;
        CodeDepartement = codeDepartement;
        NomDelaRegion = nomDelaRegion;
        PopulationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDepartement() {
        return CodeDepartement;
    }

    public String getNomDelaRegion() {
        return NomDelaRegion;
    }

    public int getPopulationTotale() {
        return PopulationTotale;
    }
}
