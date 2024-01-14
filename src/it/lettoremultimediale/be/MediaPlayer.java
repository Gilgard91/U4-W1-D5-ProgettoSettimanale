package it.lettoremultimediale.be;

import it.lettoremultimediale.be.ClassiAstratte.ElementoMedia;

import java.util.Scanner;

public class MediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMedia[] playlist = new ElementoMedia[5];

        for (int i = 0; i < 5; i++) {
            String numeroElemento;
            if (i == 0) {
                numeroElemento = "primo";
            } else if (i == 1) {
                numeroElemento = "secondo";
            } else if (i == 2) {
                numeroElemento = "terzo";
            } else if (i == 3) {
                numeroElemento = "quarto";
            } else {
                numeroElemento = "quinto";
            }
            System.out.println("Inserisci il " + numeroElemento + " elemento (1 = Audio, 2 = Video, 3 = Immagine): ");
            int tipoElemento = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo: ");
            String titolo = scanner.nextLine();

            switch (tipoElemento) {
                case 1:
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume: ");
                    int volume = scanner.nextInt();
                    playlist[i] = new AudioPlayer(titolo, durataAudio,volume);
                    break;
                case 2:
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserisci la luminosita: ");
                    int luminosita = scanner.nextInt();
                    playlist[i] = new VideoPlayer(titolo, durataVideo, volumeVideo, luminosita);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosita: ");
                    int luminositaImmagine = scanner.nextInt();
                    playlist[i] = new ImagePlayer(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non presente, inserire nuovamente.");
                    i--;
                    break;
            }
        }


        int sceltaElemento;
        do {
            System.out.println("Inserisci l'elemento che vuoi eseguire (1-5, 0 per uscire): ");
            sceltaElemento = scanner.nextInt();
            if (sceltaElemento >= 1 && sceltaElemento <= 5) {
                playlist[sceltaElemento - 1].playMedia();
            } else if (sceltaElemento != 0) {
                System.out.println("Errore");
            }
        } while (sceltaElemento != 0);
    }
}