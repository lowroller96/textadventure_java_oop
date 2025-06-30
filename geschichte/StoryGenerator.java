package geschichte;

import java.util.*;


public class StoryGenerator extends Story {

    public StoryGenerator(String erzaehlElement, int auswirkungGesundheit, int auswirkungKonto, boolean isteventNegativ,String ort,String art) {
        super(erzaehlElement,
                auswirkungGesundheit,
                auswirkungKonto,
                isteventNegativ,
                ort,
                art);
    }

    public Story[] getStories() {
    Story[] stories = new Story[19];
    return stories;


    }
    public void storyGenerieren(Story story) {

    }


    }


    //HashMap<String,Integer> geschichteMap = ArrayListToHashMap(geschichteArrayList)
    // Hash Map intialiaisieren mit String Schlüsseln + Array List
    //Map<String,List<String>> hashMap = new HashMap<>();



// Niveau 1. Array

// Niveau 2. HashMap a= Key-Value
// a.name, a.titel

//------------------------------------------------
// new HashMap(1,2,3,5,6)

//------------------------------------------------
// ArrayList
//------------------------------------------------
// Methode storyGenerieren (Story) {

//for {
//    for {
    //  new Story (1,2,3,4)
    // }
// }
// add in ArraList
//}
/*
stories[0]= new Story("Du findest eine versteckte Höhle mit frischem Wasser",+10,0,false,"Dschungel");
        stories[1]= new Story("Ein freundlicher Händler schenkt dir ein paar Münzen.",0,+20,false,"Marktplatz");
        stories[2]= new Story("Du löst ein Rätsel in einer alten Ruine und erhältst Gold.",0,+50,false,"Ruine");
        stories[3]= new Story("Ein Arzt heilt deine Wunden kostenlos.",+25,0,false,"Dorf");
        stories[4]= new Story("Du entdeckst heilende Kräuter und nutzt sie",+15,0,false,"Wald");
        stories[5]= new Story("Eine alte Frau segnet dich – du fühlst dich gestärkt.",+20,0,false,"Kapelle");
        stories[6]= new Story("Du findest eine Schatztruhe mit Münzen.",0,+100,false,"Strandhöhle");
        stories[7]= new Story("Du gewinnst bei einem Kartenspiel gegen Dorfbewohner.",0,+30,false,"Taverne");
        stories[8]= new Story("Ein verletzter Vogel führt dich zu einem geheimen Schatz.",0,+40,false,"Klippen");
        stories[9]= new Story("Du entdeckst einen geheimen Ort mit magischer Aura – du fühlst dich besser.",+10,0,false,"Wasserfall");
        stories[10]=new Story("Ein Rudel Wölfe greift dich an.",-15,0,true,"Wald");
        stories[11]=new Story("Du fällst in eine Falle und verletzt dich schwer.",-25,0,true,"Ruine");
        stories[12]=new Story("Ein Dieb stiehlt dir deine Münzen bei Nacht.",0,-30,true,"Zeltlager");
        stories[13]=new Story("Du wirst beim Fluss von einer Schlange gebissen.",-10,0,true,"Flussufer");
        stories[14]=new Story("Ein Sandsturm zwingt dich zur Flucht – du verlierst Geld.",0,-20,true,"Wüste");
        stories[15]=new Story("Du wirst von Räubern überfallen.",-10,-40,true,"Waldweg");
        stories[16]=new Story("Du verlierst dich im Nebel und verletzt dich an Dornen",-5,0,true,"Moor");
        stories[17]=new Story("Ein Händler betrügt dich mit Falschgeld.",0,-25,true,"Markt");
        stories[18]=new Story("Ein Erdbeben verletzt dich und zerstört dein Zelt.",-20,0,true,"Bergregion");
        stories[19]=new Story("Du wirst von einer wütenden Dorfbewohnerin mit Steinen beworfen.",-10,0,true,"Dorf");
 */