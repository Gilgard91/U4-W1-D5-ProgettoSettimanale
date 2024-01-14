package it.lettoremultimediale.be.ClassiAstratte;

import it.lettoremultimediale.be.Interfacce.InterfacciaVolume;

public abstract class ElementoMediaPlayable extends ElementoMedia implements InterfacciaVolume {
    protected int volume;
    protected int durata;
    public ElementoMediaPlayable(String titolo, int volume, int durata){
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

//    public ElementoMediaPlayable(String titolo, int durata){
//        super(titolo);
//        this.durata = durata;
//    }

    public abstract void play();

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void alzaVolume() {

    }
}
