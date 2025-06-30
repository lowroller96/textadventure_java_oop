package services;
import geschichte.Raetsel;
import geschichte.Story;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DateiEinlesen  {
    String dateiGeschichte ="geschichte.txt";
    String dateiRaetsel ="raetsel.txt";
    FileReader geschichteEinlesen ;
    FileReader raetselEinlesen;

    public void getData () {
        try {
            geschichteEinlesen = new FileReader(dateiGeschichte);
            raetselEinlesen = new FileReader(dateiRaetsel);
        } catch (FileNotFoundException e) {
            System.out.println("Ein Fehler beim Einlesevorgang der txt. Dateien ist aufgetreten");
            System.out.println(e.getMessage());
            List <Story>  geschichten = new ArrayList<>();
            List <Raetsel> raetsel = new ArrayList<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dateiGeschichte)));
            String line;
            while ((line=bufferedReader.readLine)!=null) {
            geschichten.add(new Story(line));
            } catch (IOException e) {
            System.out.println("Fehler beim Einlesen der Datei geschichten.txt" +e.getMessage());

        }
    }

}
