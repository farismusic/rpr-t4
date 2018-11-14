package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class PlanStudija {
    private String imeStudija;
    private ArrayList<Predmet> obavezniPredmeti;
    private ArrayList<Predmet> izborniPredmeti;

    public PlanStudija(String ime){
        setImeStudija(ime);
        setObavezniPredmeti(new ArrayList<Predmet>());
        setIzborniPredmeti(new ArrayList<Predmet>());
    }

    public void dodajObavezniPredmet(Predmet predmet){
        getObavezniPredmeti().add(predmet);
    }
    public void dodajIzborniPredmet(Predmet predmet){
        getIzborniPredmeti().add(predmet);
    }
    public void obrisiObavezniPredmet(Predmet predmet){
        getObavezniPredmeti().remove(predmet);
    }
    public void obrisiIzborniPredmet(Predmet predmet){
        getIzborniPredmeti().remove(predmet);
    }

    public String getImeStudija() {
        return imeStudija;
    }

    public void setImeStudija(String imeStudija) {
        this.imeStudija = imeStudija;
    }

    public ArrayList<Predmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public void setObavezniPredmeti(ArrayList<Predmet> obavezniPredmeti) {
        this.obavezniPredmeti = obavezniPredmeti;
    }

    public ArrayList<Predmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public void setIzborniPredmeti(ArrayList<Predmet> izborniPredmeti) {
        this.izborniPredmeti = izborniPredmeti;
    }
}
