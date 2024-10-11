package fr.diginamic.maison;

public abstract class Chambre  extends Piece{
    private double superficie;
    private int numeroEtage;

    public Chambre(double superficie, int numeroEtage) {
        super(superficie, numeroEtage);
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getNumeroEtage() {
        return numeroEtage;
    }

    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
}
