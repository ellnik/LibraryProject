/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein Buch aus Amazon.
 * Sie erweitert die Klasse Book und fügt zusätzliche Informationen hinzu:
 * - ISBN
 * - Beschreibung (summary)
 * - Preis
 * - Bewertung
 * - Liste von Rezensionen
 */
package objects.amazon;

import java.util.ArrayList;
import objects.Book;

public class AmazonBook extends Book {

    // Internationale Standardbuchnummer
    private String ISBN;

    // Kurzbeschreibung des Buches
    private String summary;

    // Preis des Buches
    private double price;

    // Bewertung (z.B. 4 von 5 Sternen)
    private int review;

    // Liste von Rezensionen (Textbewertungen)
    private ArrayList<String> recensions = new ArrayList<>();

    /**
     * Konstruktor
     * Erstellt ein AmazonBook mit Titel und Autor
     * 
     * @param title  Titel des Buches
     * @param author Autor des Buches
     */
    public AmazonBook(String title, String author) {
        super(title, author);
    }

    /**
     * Gibt alle Informationen über das Buch als String zurück
     * Nutzt zusätzlich die toString()-Methode der Oberklasse (Book)
     */
    @Override
    public String toString() {
        String info = super.toString();

        info += "ISBN: " + ISBN + Book.EOL;
        info += "Beschreibung: " + summary + Book.EOL;
        info += "Preis: " + price + "€" + Book.EOL;
        info += "Bewertung: " + review + "/5" + Book.EOL;

        info += "Rezensionen:" + Book.EOL;

        // Durchläuft alle Rezensionen und fügt sie hinzu
        for (String r : recensions) {
            info += "- " + r + Book.EOL;
        }

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
     * Gibt die Beschreibung zurück
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Setzt die Beschreibung
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Gibt die Liste der Rezensionen zurück
     */
    public ArrayList<String> getRecensions() {
        return recensions;
    }

    /**
     * Setzt die Liste der Rezensionen
     */
    public void setRecensions(ArrayList<String> recensions) {
        this.recensions = recensions;
    }

    /**
     * Gibt den Preis zurück
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setzt den Preis
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gibt die Bewertung zurück
     */
    public int getReview() {
        return review;
    }

    /**
     * Setzt die Bewertung
     */
    public void setReview(int review) {
        this.review = review;
    }
}