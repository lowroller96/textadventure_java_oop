package geschichte;

public class Raetsel {
    protected String raetselText;
    protected int auswirkungKonto;
    protected String antworten;
    protected String richtigeAntwort;
    protected String art;

    public Raetsel(
            String raetselText,
            int ausWirkungKonto,
            String antworten,
            String richtigeAntwort,
            String art) {
        this.raetselText = raetselText;
        this.auswirkungKonto = ausWirkungKonto;
        this.antworten = antworten;
        this.richtigeAntwort = richtigeAntwort;
        this.art = art;

    }

    public String getRaetselText() {
        return raetselText;
    }

    public void setRaetselText(String raetselText) {
        this.raetselText = raetselText;
    }

    public int getAuswirkungKonto() {
        return auswirkungKonto;
    }

    public void setAuswirkungKonto(int auswirkungKonto) {
        this.auswirkungKonto = auswirkungKonto;
    }

    public String getantworten() {
        return antworten;
    }

    public void setAntworten(String antworten) {
        this.antworten = antworten;
    }

    public String getrichtigeAntwort() {
        return richtigeAntwort;
    }

    public void setrichtigeAntwort(String richtigeAntwort) {
        this.richtigeAntwort = richtigeAntwort;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

}
