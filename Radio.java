import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Radio implements Elektronik, ChanelRadio, ChanelTv {
    private boolean mesin; String [] chanel={"Gajah Mada FM","SCTV FM","RCTI FM"};
    private int volume;
    private int Chanel;

    public Radio() {
        mesin = false;
        volume = 0;
        Chanel = 3;
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
        Chanel = 3;
    }

    public void gantichanel(int c) {
        Chanel = 3;
    }

    public void perbesarVolume() {
        volume++;
    }

    public void perkecilVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
