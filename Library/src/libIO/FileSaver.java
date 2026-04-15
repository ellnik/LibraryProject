/**
 * @author Olena Nikolaienko
 * 
 * Klasse zum Speichern von Objekten in eine Datei.
 * Hier wird eine Library als Text in eine .txt-Datei gespeichert.
 */
package libIO;

import java.io.FileOutputStream;
import java.io.IOException;
import objects.Library;

public class FileSaver {

    /**
     * Speichert eine Bibliothek in eine Textdatei.
     * 
     * Ablauf:
     * 1. Library wird mit toString() in Text umgewandelt
     * 2. Text wird in Bytes konvertiert
     * 3. Datei wird im Ordner "Data" erstellt/überschrieben
     * 4. Bytes werden in die Datei geschrieben
     * 
     * @param lib      Objekt der Klasse Library, das gespeichert werden soll
     * @param fileName Name der Datei (ohne .txt)
     * @return Erfolgsmeldung oder Fehlermeldung
     */
    public static String saveLibrary(Library lib, String fileName) {

        // Wandelt das Objekt in einen String um
        String text = lib.toString();

        // Konvertiert den String in ein Byte-Array
        byte[] bytes = text.getBytes();

        // Erstellt den vollständigen Dateipfad
        fileName = "./Data/" + fileName + ".txt";

        // Öffnet den Stream und schreibt die Bytes in die Datei
        // try-with-resources sorgt dafür, dass der Stream automatisch geschlossen wird
        try (FileOutputStream output = new FileOutputStream(fileName)) {

            output.write(bytes); // schreibt Daten in die Datei

            return "Successfully wrote to file.";

        } catch (IOException e) {

            // Fehlerbehandlung, falls Schreiben fehlschlägt
            return "Error writing file: " + e.getMessage();
        }
    }
}