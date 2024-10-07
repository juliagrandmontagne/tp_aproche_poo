package banque.entites;

public class CompteTaux extends Compte {
    int leTauxDeRémunération;

    public CompteTaux(int soldeDuCompte, int numéroDeCompte, int leTauxDeRémunération) {
        super(soldeDuCompte, numéroDeCompte);
        this.leTauxDeRémunération = leTauxDeRémunération;
    }
}
