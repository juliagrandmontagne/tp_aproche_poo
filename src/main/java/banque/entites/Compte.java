package banque.entites;
public class Compte {
    private int numéroDeCompte;
    private int soldeDuCompte;

    public Compte(int soldeDuCompte, int numéroDeCompte) {
        this.soldeDuCompte = soldeDuCompte;
        this.numéroDeCompte = numéroDeCompte;

    }
    @Override
    public String toString() {
        return numéroDeCompte+""+soldeDuCompte;
    }

    public void setNuméroDeCompte(int numéroDeCompte) {
        this.numéroDeCompte = numéroDeCompte;
    }

    public int getNuméroDeCompte() {
        return numéroDeCompte;
    }

    public void setSoldeDuCompte(int soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;

    }

    public int getSoldeDuCompte() {
        return soldeDuCompte;
    }
}
