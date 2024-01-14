package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoMediaPlayable;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;

public class VideoPlayer extends ElementoMediaPlayable implements InterfacciaLuminosita {

    private int luminosita;
    public VideoPlayer(String titolo, int durata, int volume, int luminosita){
        super(titolo, durata, volume);
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(" " + titolo);
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if(luminosita > MIN_LUMINOSITA){
            luminosita--;
        }
    }

    @Override
    public void aumentaLuminosita() {
        if(luminosita != MAX_LUMINOSITA){
            luminosita++;
        }
    }

    @Override
    public void abbassaVolume() {
        if(volume > MIN_VOLUME){
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        if(volume != MAX_VOLUME){
            volume++;
        }
    }

    @Override
    public void playMedia() {
        play();
    }

}
