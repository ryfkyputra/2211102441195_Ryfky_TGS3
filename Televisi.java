import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Televisi implements Elektronik, ChanelTv {
    private boolean mesin; String [] chanel={"Gajah Mada FM","SCTV FM","RCTI FM"};
    private String merk;
    private boolean listrik;

    public Televisi(String merk) {
        this.mesin = false;
        this.merk = merk;
        this.listrik = false;
    }

    @Override
    public void on() {
        mesin = true;
    }

    @Override
    public void off() {
        mesin = false;
    }

    @Override
    public void gantiChanel(int c) {
        // Implementasi untuk mengganti saluran TV
    }
}
