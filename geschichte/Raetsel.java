package geschichte;

public class Raetsel {
    protected String raetselText;
    protected int auswirkungKonto;
    protected String[] antworten;
    protected String art;

    public Raetsel(
            String raetselText,
            int ausWirkungKonto,
            String[] antworten,
            String art) {
        this.raetselText = raetselText;
        this.auswirkungKonto = ausWirkungKonto;
        this.antworten = antworten;
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

    public String[] getantworten() {
        return antworten;
    }

}
