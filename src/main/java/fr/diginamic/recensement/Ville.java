package fr.diginamic.recensement;

public class Ville {
    String codeRegion;
    String nomDeLaRegion;
    String codeDepartement;
    String codeDeLaCommune;
    String nomDeLaCommune;
    int populationTotale;

    public Ville(String codeRegion, String nomDeLaRegion, String codeDepartement, String codeDeLaCommune, String nomDeLaCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomDeLaRegion = nomDeLaRegion;
        this.codeDepartement = codeDepartement;
        this.codeDeLaCommune = codeDeLaCommune;
        this.nomDeLaCommune = nomDeLaCommune;
        this.populationTotale = populationTotale;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeDeLaCommune() {
        return codeDeLaCommune;
    }

    public void setCodeDeLaCommune(String codeDeLaCommune) {
        this.codeDeLaCommune = codeDeLaCommune;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}
