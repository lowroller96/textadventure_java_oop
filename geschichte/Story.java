package geschichte;

public class Story {
    protected String erzaehlElement;
    protected int auswirkungGesundheit;
    protected int auswirkungKonto;
    protected boolean isteventNegativ;
    protected String ort;

    public Story(
            String erzaehlElement,
            int auswirkungGesundheit,
            int auswirkungKonto,
            boolean isteventNegativ,
            String ort){
        this.erzaehlElement = erzaehlElement;
        this.auswirkungGesundheit=auswirkungGesundheit;
        this.auswirkungKonto=auswirkungKonto;
        this.isteventNegativ=isteventNegativ;
        this.ort=ort;
    }
    public String getErzaehlElement() {
        return erzaehlElement;
    }

    public void setErzaehlElement(String erzaehlElement) {
        this.erzaehlElement = erzaehlElement;
    }

    public int getAuswirkungGesundheit() {
        return this.auswirkungGesundheit;
    }
    public void setAuswirkungGesundheit(int auswirkungGesundheit) {
        this.auswirkungGesundheit=auswirkungGesundheit;
    }

    public int getAuswirkungKonto() {
        return this.auswirkungKonto;
    }

    public void setAuswirkungKonto(int auswirkungKonto) {
        this.auswirkungKonto = auswirkungKonto;
    }

    public boolean isIsteventNegativ() {
        return  this.isteventNegativ;
    }

    public void setIsteventNegativ(boolean isteventNegativ) {
        this.isteventNegativ = isteventNegativ;
    }

    public String getOrt() {
        return  this.ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}

