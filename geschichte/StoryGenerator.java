package geschichte;

public class StoryGenerator extends Story {

    public StoryGenerator(String erzaehlElement, int auswirkungGesundheit, int auswirkungKonto, boolean isteventNegativ, String ort, String art) {
        super(erzaehlElement,
                auswirkungGesundheit,
                auswirkungKonto,
                isteventNegativ,
                ort);
    }
}

  /*
  public class StoryGenerator {
    private List<Story> storyList;    // positive und negative Geschichten
    private List<Story> raetselList;  // alle Rätsel
    private Random random = new Random();

    public StoryGenerator(List<Story> storyList, List<Story> raetselList) {
        this.storyList = storyList;
        this.raetselList = raetselList;
    }

    public void generiereGeschichteMitRaetseln() {
        // 1. Zufällige Story auswählen
        Story zufallsStory = storyList.get(random.nextInt(storyList.size()));
        String ort = zufallsStory.getOrt();

        // 2. Passende Rätsel nach Ort filtern
        List<Story> passendeRaetsel = raetselList.stream()
                .filter(r -> r.getOrt().equalsIgnoreCase(ort))
                .collect(Collectors.toList());

        // 3. Zwei zufällige Rätsel ziehen
        List<Story> ausgewaehlteRaetsel = new ArrayList<>();
        if (passendeRaetsel.size() >= 2) {
            while (ausgewaehlteRaetsel.size() < 2) {
                Story r = passendeRaetsel.get(random.nextInt(passendeRaetsel.size()));
                if (!ausgewaehlteRaetsel.contains(r)) {
                    ausgewaehlteRaetsel.add(r);
                }
            }
        }

        // 4. Ausgabe
        System.out.println("📘 Hauptgeschichte:");
        System.out.println("- " + zufallsStory.getErzaehlElement());

        System.out.println("\n🧩 Passende Rätsel:");
        for (Story raetsel : ausgewaehlteRaetsel) {
            System.out.println("- " + raetsel.getErzaehlElement());
        }
    }
}
   */


