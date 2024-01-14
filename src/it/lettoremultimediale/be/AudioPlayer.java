package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoMediaPlayable;

public class AudioPlayer extends ElementoMediaPlayable {

    public AudioPlayer(String titolo, int durata, int volume){
        super(titolo, durata, volume);
        if(volume > MAX_VOLUME){
            System.out.println("Valore non valido, volume settato al massimo");
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        };
    }
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(" " + titolo);
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
