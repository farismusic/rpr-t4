package ba.unsa.etf.rpr.predavanje03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Predmet matematika = new Predmet("Matematika", "Mirnes Smajilovic", 7);
        PlanStudija novi = new PlanStudija("novi");
        Semestar treci = new Semestar(3, novi, 30);
        Student faris = new Student("Faris", "Music", 18296, novi, treci);
        matematika.dodajStudenta(faris);
        ArrayList<Student> studenti = matematika.getStudenti();
        for(Student student : studenti){
            System.out.println(student.getIme()+" "+student.getPrezime()+" "+student.getBrojIndeksa());
        }
    }
}
