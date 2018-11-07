package ba.unsa.etf.rpr.predavanje03;

public class Predmet {
    private String ime;
    private int iznosECTS;
    private Student[] upisaniStuddenti;
    private Semestar semestar;
    private String imePrezimeProfesora;

    public Predmet(){};
    public Predmet(String imePredmeta, String profesor, int ects, int semestar){};
    public void dodajStudenta(Student student){};
    public void obrisiStudenta(Student student){};

    public String getIme() {
        return ime;
    }

    public int getIznosECTS() {
        return iznosECTS;
    }

    public Student[] getUpisaniStuddenti() {
        return upisaniStuddenti;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }
}
