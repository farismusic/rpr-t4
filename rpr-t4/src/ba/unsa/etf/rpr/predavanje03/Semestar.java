package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class Semestar {
    private int brojSemestra;
    private PlanStudija planStudija;
    private int ects;
    private ArrayList<Predmet> predmeti;

    public Semestar(){};
    public Semestar (int broj, PlanStudija plan, int ects){
        setBrojSemestra(broj);
        setPlanStudija(plan);
        this.setEcts(ects);
        setPredmeti(new ArrayList<Predmet>());
    }
    public void dodajPredmet(Predmet predmet){
        getPredmeti().add(predmet);
    }
    public void obrisiPredmet(Predmet predmet){
        getPredmeti().remove(predmet);
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }
}
