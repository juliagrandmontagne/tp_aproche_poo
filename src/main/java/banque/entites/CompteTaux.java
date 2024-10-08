package banque.entites;

public class CompteTaux extends Compte {
    private double taux ;

    public CompteTaux(int soldeDuCompte, int numéroDeCompte, double taux) {
        super(soldeDuCompte, numéroDeCompte);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
