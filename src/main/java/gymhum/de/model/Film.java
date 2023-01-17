package gymhum.de.model;

public class Film {
    
    String Titel;
    String Laenge;
    int FSK;

    public Film(String Titel, String Laenge, int FSK){
        setTitel(Titel);
        setLaenge(Laenge);
        setFSK(FSK);
    }
    public void setTitel(String titel) {
        Titel = titel;
    }
    public String getTitel() {
        return Titel;
    }
    public void setLaenge(String laenge) {
        Laenge = laenge;
    }
    public String getLaenge() {
        return Laenge;
    }
    public void setFSK(int fSK) {
        FSK = fSK;
    }
    public int getFSK() {
        return FSK;
    }
}
