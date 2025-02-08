public class exceptions {
    int att;
    void nullpointer() {
        exceptions e = null;
        e.att = 1;
    }

    //zur a: Accessing an attribute or method on a null object references leads to a NullPointerExceptions
    //b wrap it in try-catch

    public static void main(String[] args) {
        try {
            exceptions e = new exceptions();
            e.nullpointer();
        }catch (NullPointerException e) {
            System.out.println("\nError occured: " + e.getMessage());
        }

    }
}
