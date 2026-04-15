/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein privates Buch.
 * Sie erweitert die Klasse Book und speichert zusätzliche persönliche Informationen:
 * - ob das Buch gelesen wurde
 * - Kaufdatum
 * - Zustand des Buches
 */
package objects.privat;

import java.time.LocalDate;
import objects.Book;

public class MyBook extends Book {

    /**
     * Gibt an, ob das Buch gelesen wurde
     */
    private boolean read;

    /**
     * Kaufdatum des Buches
     */
    private LocalDate buyDate;

    /**
     * Zustand des Buches (z.B. Skala von 1 bis 10)
     */
    private int state;

    /**
     * Konstruktor mit Titel und Autor
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     */
    public MyBook(String title, String author) {
        super(title, author);
    }

    /**
     * Konstruktor mit allen Parametern
     * 
     * @param title    Titel des Buches
     * @param author   Autor des Buches
     * @param read     ob das Buch gelesen wurde
     * @param buyDate  Kaufdatum
     * @param state    Zustand des Buches
     */
    public MyBook(String title, String author, boolean read, LocalDate buyDate, int state) {
        super(title, author);
        this.read = read;
        this.buyDate = buyDate;
        this.state = state;
    }

    /**
     * Gibt alle Informationen zum Buch als String zurück
     * Nutzt zusätzlich die toString()-Methode der Oberklasse (Book)
     */
    @Override
    public String toString() {
        String info = super.toString();

        info += "Gekauft am " + buyDate + Book.EOL;
        info += "Gelesen: " + read + Book.EOL;
        info += "Zustand: " + state + Book.EOL;

        return info;
    }

    /**
     * Setzt, ob das Buch gelesen wurde
     */
    public void setRead(boolean read) {
        this.read = read;
    }

    /**
     * Setzt das Kaufdatum
     */
    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    /**
     * Setzt den Zustand des Buches
     */
    public void setState(int state) {
        this.state = state;
    }
}