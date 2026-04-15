/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse stellt eine Bibliothek dar.
 * Sie verwaltet eine Sammlung von Büchern.
 */
package objects;

import java.util.ArrayList;

public class Library {

    /**
     * Name des Besitzers der Bibliothek
     */
    String owner;

    /**
     * Liste aller Bücher in der Bibliothek
     */
    ArrayList<Book> books = new ArrayList<>();

    /**
     * Konstruktor der Klasse Library
     * Initialisiert den Besitzer der Bibliothek
     * 
     * @param owner Name des Besitzers
     */
    public Library(String owner) {
        this.owner = owner;
    }

    /**
     * Gibt alle Informationen über die Bibliothek als String zurück
     * Listet alle enthaltenen Bücher auf
     */
    @Override
    public String toString() {
        String info = "Bibliothek von " + owner + Book.EOL;
        info += "----------------" + Book.EOL;
        info += "Bücher:" + Book.EOL;

        // Durchläuft alle Bücher und fügt deren Informationen hinzu
        for (int i = 0; i < books.size(); i++) {
            info += books.get(i).toString() + Book.EOL;
        }

        return info;
    }

    /**
     * Fügt ein bestehendes Buch zur Bibliothek hinzu
     * 
     * @param book Buch-Objekt
     */
    public void addBook(Book book) {
        books.add(book);
    }

    /**
     * Erstellt ein neues Buch und fügt es zur Bibliothek hinzu
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     */
    public void addBook(String title, String author) {
        addBook(new Book(title, author));
    }
}