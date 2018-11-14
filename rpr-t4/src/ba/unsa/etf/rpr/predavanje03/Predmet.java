package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class Predmet {
    private String ime;
    private int iznosECTS;
    private ArrayList<Student> studenti;
    private String imePrezimeProfesora;

    public Predmet(){};
    public Predmet(String imePredmeta, String profesor, int ects){
        setIme(imePredmeta);
        this.setImePrezimeProfesora(profesor);
        setIznosECTS(ects);
        setStudenti(new ArrayList<Student>());
    }
    public void dodajStudenta(Student student){
        getStudenti().add(student);
    }
    public void obrisiStudenta(Student student){
        getStudenti().remove(student);
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getIznosECTS() {
        return iznosECTS;
    }

    public void setIznosECTS(int iznosECTS) {
        this.iznosECTS = iznosECTS;
    }

    public ArrayList<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Student> studenti) {
        this.studenti = studenti;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }
}
