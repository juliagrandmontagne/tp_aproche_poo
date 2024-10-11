package fr.diginamic.maison;

public class WC extends Piece {
    private double superficie;
    private int numeroEtage;

    public WC(double superficie, int numeroEtage, double superficie1, int numeroEtage1) {
        super(superficie, numeroEtage);
        this.superficie = superficie1;
        this.numeroEtage = numeroEtage1;
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
