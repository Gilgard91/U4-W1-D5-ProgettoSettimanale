package it.lettoremultimediale.be.ClassiAstratte;

public abstract class ElementoMedia {
    protected String titolo;
    public ElementoMedia(String titolo){
        this.titolo = titolo;

    }
    public abstract void playMedia();
}
