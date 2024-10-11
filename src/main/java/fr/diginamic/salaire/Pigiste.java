package fr.diginamic.salaire;

public abstract class Pigiste extends Intervenant {
   private String nom ;
   private String prenom;
   private int NombreDeJourTravailler;
   private int montantJournalierDeRemuneration;

    public Pigiste(String nom, String prenom, int nombreDeJourTravailler, int montantJournalierDeRemuneration) {
        super(nom, prenom);
        this.NombreDeJourTravailler = nombreDeJourTravailler;
        this.montantJournalierDeRemuneration= montantJournalierDeRemuneration;
    }

    @Override
    public int getSalaire() {
        return NombreDeJourTravailler*montantJournalierDeRemuneration;
    }

    //   nb_jour, prix
//    public Pigiste(String nom, String prenom) {
//        this.nom = nom;
//        this.prenom = prenom;
//    }
//    public abstract double getSalaire( ) {
//        return 0;
//    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNombreDeJourTravailler() {
        return NombreDeJourTravailler;
    }

    public void setNombreDeJourTravailler(int nombreDeJourTravailler) {
        NombreDeJourTravailler = nombreDeJourTravailler;
    }

}
