package fr.diginamic.salaire;

public abstract class Salarie extends Intervenant {
   private String nom;
   private String prenom ;
   private String contrat;
   private int salaire;

    public Salarie(String nom, String prenom, String contrat, int salaire) {
        super(nom, prenom);
        this.contrat = contrat;
        this.salaire = salaire;
    }

    @Override
    public int getSalaire() {
       return salaire;
    }

    public void afficherDonnees() {
        System.out.println(super.getPrenom());
        System.out.println(super.getNom());
        System.out.println(getSalaire());
        System.out.println(getType());
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getType() {
        return contrat;
    }

    public void setType(String type) {
        this.contrat = type;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}
