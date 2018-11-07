package ba.unsa.etf.rpr.predavanje03;

public class Semestar {
    private int brojSemestra;
    private int brojPredmeta;
    private String smijer;
    private int ects;
    private Predmet[] predmeti;
    private Predmet[] izborni;

    public Semestar(){};
    public Semestar (int broj, int brojPredmeta){};
    public void dodajPredmet(Predmet predmet){};
    public void obrisiPredmet(Predmet predmet){};

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public String getSmijer() {
        return smijer;
    }

    public int getEcts() {
        return ects;
    }

    public Predmet[] getPredmeti() {
        return predmeti;
    }

    public Predmet[] getIzborni() {
        return izborni;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }
}
