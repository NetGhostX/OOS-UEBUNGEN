import java.util.Date;

abstract class Mitarbeiter {
    int persNr;
    String name;
    Date eintrittt;
    abstract double monatsBrutto();
}

class Angestellter extends Mitarbeiter {

    @Override
    double monatsBrutto() {
        return 0;
    }
}





public class Arbeiter{
    double studenLohn;
    double anzahlStunden;
    double ueberStundenZuschlag;
    double anzahlUeberStunden;
    double schichtZuschlag;

    public Arbeiter() {
        this.studenLohn = 0;
        this.anzahlStunden = 0;
        this.ueberStundenZuschlag = 0;
        this.anzahlUeberStunden = 0;
        this.schichtZuschlag = 0;
    }
    public Arbeiter(double stundenLohn, double anzahlStunden, double ueberStundenZuschlag, double anzahlUeberStunden, double schichtZuschlag) {
        this.studenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
        this.ueberStundenZuschlag = ueberStundenZuschlag;
        this.anzahlUeberStunden = anzahlUeberStunden;
        this.schichtZuschlag = schichtZuschlag;
    }
    public double monatsBrutto() {return 0.0;}

    @Override
    public String toString() {
        return toString() + "StundenLohn: " + this.anzahlStunden
                + "AnzahlStunden: " + this.anzahlStunden
                + "UeberStunden: " + this.ueberStundenZuschlag
                + "SchichtZuschlag: " + this.schichtZuschlag;
    }


}
