/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein allgemeines Buch.
 * Sie ist die Superklasse für alle Buchtypen (z.B. AmazonBook, MyBook, PublicBook).
 * 
 * Die Klasse enthält grundlegende Informationen:
 * - Titel
 * - Autor
 */
package objects;

public class Book {

    /**
     * Hilfskonstante für Zeilenumbrüche
     */
    public static final String EOL = "\n";

    /**
     * Titel des Buches
     */
    private String title;

    /**
     * Autor des Buches
     */
    private String author;

    /**
     * Konstruktor der Klasse Book
     * Initialisiert Titel und Autor
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Gibt die Informationen über das Buch als String zurück
     */
    @Override
    public String toString() {
        String info = EOL + "Information zum Buch:" + EOL;
        info += "Titel: " + title + EOL;
        info += "Autor: " + author + EOL;

        return info;
    }

    /**
     * Gibt den Titel zurück
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setzt den Titel
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gibt den Autor zurück
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setzt den Autor
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}