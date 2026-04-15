/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse dient zum Testen der Bibliothek.
 * Es werden verschiedene Buchtypen erstellt und zur Bibliothek hinzugefügt.
 * Anschließend wird die Bibliothek in eine Datei gespeichert und ausgegeben.
 */
package sandbox;

import java.time.LocalDate;
import libIO.FileSaver;
import objects.Library;
import objects.amazon.AmazonBook;
import objects.privat.MyBook;
import objects.state.PublicBook;

public class LibraryCreator {

    /**
     * Hauptmethode zum Starten des Programms
     */
    public static void main(String[] args) {

        // Erstellung einer neuen Bibliothek
        Library biblio = new Library("Testbibliothek");

        MyBook book;

        /**
         * Erstellt mehrere MyBook-Objekte und fügt sie zur Bibliothek hinzu
         */
        for (int i = 0; i < 3; i++) {
            book = new MyBook("book." + i + " Titel", "book." + i + " Autor");

            // Setzt zusätzliche Eigenschaften
            book.setBuyDate(LocalDate.now());
            book.setRead(i % 3 == 0);

            // Hinzufügen zur Bibliothek
            biblio.addBook(book);
        }

        /**
         * Erstellung und Hinzufügen eines PublicBook
         */
        PublicBook pb = new PublicBook("Der Neben", "Stephen King", "ISBN-12345");
        pb.setRead(true);
        pb.setState(8);
        biblio.addBook(pb);

        /**
         * Erstellung und Hinzufügen eines AmazonBook
         */
        AmazonBook ab = new AmazonBook("Die Therapie", "Sebastian Fitzbek");
        ab.setISBN("ISBN-99999");
        ab.setSummary("Ein Buch über sauberen Code.");
        ab.setPrice(39.99);
        ab.setReview(5);

        // Hinzufügen von Rezensionen
        ab.getRecensions().add("Sehr gutes Buch!");
        ab.getRecensions().add("Ein neuer Kommentar wird gespeichert.");

        biblio.addBook(ab);

        /**
         * Speichern der Bibliothek in eine Datei
         */
        String err = FileSaver.saveLibrary(biblio, "Testbibliothek");
        System.out.println(err);

        /**
         * Ausgabe der Bibliothek auf der Konsole
         */
        System.out.println(biblio);
    }
}