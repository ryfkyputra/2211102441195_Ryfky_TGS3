import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class MobilNegara extends MobilTransportasi implements Sirine {
    public MobilNegara(int jmlKursi) {
        super(jmlKursi);
    }

    @Override
    public void nyalakanSirine() {
        // Implementasi untuk menyalakan sirine pada mobil negara
    }

    @Override
    public void matikanSirine() {
        // Implementasi untuk mematikan sirine pada mobil negara
    }

    @Override
    public void gantiSuaraSirine(int jenis) {
        // Implementasi untuk mengganti suara sirine pada mobil negara
    }

    public void nyalakanTape() {
        // Implementasi untuk menyalakan tape pada mobil negara
    }

    public void nyalakanTV() {
        // Implementasi untuk menyalakan TV pada mobil negara
    }

    public void nyalakanAC() {
        // Implementasi untuk menyalakan AC pada mobil negara
    }
}