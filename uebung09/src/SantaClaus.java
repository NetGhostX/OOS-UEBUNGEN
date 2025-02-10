public class SantaClaus {
    public String vorname;
    public String nachname;

    private static SantaClaus instance;

    private SantaClaus(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public static SantaClaus getInstance(String vorname, String nachname){
        if(instance == null){
            instance = new SantaClaus(vorname,nachname);
        }
        return instance;
    }
}
