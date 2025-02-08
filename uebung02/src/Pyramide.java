public class Pyramide implements körper{
    int länge;
    int höhe;
    int breite;
    @Override
    public int volumen() {
        return 1/3 * länge*breite*höhe;
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
