package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class Student extends ArrayList<Student> {
    private String ime;
    private String prezime;
    private PlanStudija planStudija;
    private int brojIndeksa;
    private Semestar semestar;

    public Student(){}

    public Student(String ime, String prezime, int brojindeksa, PlanStudija planStudija, Semestar semestar){
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setBrojIndeksa(brojindeksa);
        this.setPlanStudija(planStudija);
        this.setSemestar(semestar);
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(PlanStudija planStudija) {
        this.planStudija = planStudija;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }
}
