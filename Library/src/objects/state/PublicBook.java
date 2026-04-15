/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein öffentliches Buch mit ISBN.
 * Sie erweitert die Klasse Book und enthält zusätzliche Informationen:
 * - ISBN
 * - ob das Buch gelesen wurde
 * - Zustand des Buches
 */
package objects.state;

import objects.Book;

public class PublicBook extends Book {

    /**
     * Internationale Standardbuchnummer
     */
    private String ISBN;

    /**
     * Gibt an, ob das Buch gelesen wurde
     */
    private boolean read;

    /**
     * Zustand des Buches (z.B. Skala von 1 bis 10)
     */
    private int state;

    /**
     * Standard-Konstruktor
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     */
    public PublicBook(String title, String author) {
        super(title, author);
    }

    /**
     * Konstruktor mit ISBN
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     * @param ISBN   ISBN des Buches
     */
    public PublicBook(String title, String author, String ISBN) {
        super(title, author);
        this.ISBN = ISBN;
    }

    /**
     * Vollständiger Konstruktor
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     * @param ISBN   ISBN
     * @param read   gelesen oder nicht
     * @param state  Zustand des Buches
     */
    public PublicBook(String title, String author, String ISBN, boolean read, int state) {
        super(title, author);
        this.ISBN = ISBN;
        this.read = read;
        this.state = state;
    }

    /**
     * Gibt alle Informationen über das Buch als String zurück
     */
    @Override
    public String toString() {
        String info = super.toString();

        info += "ISBN: " + ISBN + Book.EOL;
        info += "Gelesen: " + read + Book.EOL;
        info += "Zustand: " + state + Book.EOL;

        return info;
    }

    // ===== Getter & Setter =====

    /**
     * Gibt die ISBN zurück
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Setzt die ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Setzt, ob das Buch gelesen wurde
     */
    public void setRead(boolean read) {
        this.read = read;
    }

    /**
     * Setzt den Zustand des Buches
     */
    public void setState(int state) {
        this.state = state;
    }
}