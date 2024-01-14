package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoMedia;
import it.lettoremultimediale.be.Interfacce.InterfacciaLuminosita;

public class ImagePlayer extends ElementoMedia implements InterfacciaLuminosita {

    private int luminosita;
    public ImagePlayer(String titolo, int luminosita){
        super(titolo);
        if(luminosita > MAX_LUMINOSITA){
            System.out.println("Valore non valido, luminosità settata al massimo ");
            this.luminosita = MAX_LUMINOSITA;
        } else {
            this.luminosita = luminosita;
        };
    }


    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" " + titolo);
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
    public void playMedia() {
        show();
    }
}
