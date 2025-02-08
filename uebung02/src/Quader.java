public class Quader implements körper{
    int länge;
    int höhe;
    int breite;

    public Quader(int länge, int höhe, int breite) {
        this.länge = länge;
        this.höhe = höhe;
        this.breite = breite;
    }

    @Override
    public int volumen() {
        return 0;
    }

    @Override
    public int länge() {
        return this.länge;
    }

    @Override
    public int höhe() {
        return this.höhe;
    }

    @Override
    public int breite() {
        return this.breite;
    }
}