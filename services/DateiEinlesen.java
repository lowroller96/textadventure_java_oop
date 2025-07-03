package services;

import geschichte.Raetsel;
import geschichte.Story;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DateiEinlesen {
    String dateiGeschichte = "services/geschichte.txt";
    String dateiRaetsel = "services/raetsel.txt";
    FileReader geschichteEinlesen;
    FileReader raetselEinlesen;

    // Methode ArrayList erzeugen File read Line per Line, Speration Objekte per Komma
    public ArrayList<Story> getArrayListGeschichte() {
        ArrayList<Story> geschichten = new ArrayList<>();

        try {
            List<String> zeilen = Files.readAllLines(Paths.get(dateiGeschichte));
            for (String zeile : zeilen) {
                String[] teile = zeile.split("/");
                geschichten.add(new Story(teile[0], Integer.valueOf(teile[1]), Integer.valueOf(teile[2]), Boolean.getBoolean(teile[3]), teile[4]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return geschichten;
    }

    // Methode ArrayList erzeugen File read Line per Line, Speration Objekte per Komma
    public ArrayList<Raetsel> getArrayListRaetsel() {
        ArrayList<Raetsel> raetsel = new ArrayList<>();
        try {
            List<String> zeilen = Files.readAllLines(Paths.get(dateiRaetsel));
            for (String zeile : zeilen) {
                String[] teile = zeile.split("/");
                raetsel.add(new Raetsel(teile[0], Integer.valueOf(teile[1]), (teile[2]), teile[3], teile[4]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return raetsel;
    }
}

// Klasse trennen
//Methode aufruf Datei  auslagern in eigene Klasse wieder aufrufen
// Methode Praser auslagern in eigene Klasse
