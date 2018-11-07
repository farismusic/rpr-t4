package ba.unsa.etf.rpr.predavanje03;

public class Student {
    private String ime;
    private String prezime;
    private int prenosECTS;
    private int brojIndeksa;
    private Semestar semestar;

    public Student(){}
    public Student(String ime, String prezime, int brojindeksa){};

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getPrenosECTS() {
        return prenosECTS;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setPrenosECTS(int prenosECTS) {
        this.prenosECTS = prenosECTS;
    }

    public void setSemestar(Semestar semestar) {
        semestar = semestar;
    }
}
