public class  tweakExceptions extends Exception{
    public tweakExceptions(String message) {
        super(message);
    }

    public void fuckThatTweaker() throws tweakExceptions {
        throw new tweakExceptions("My prof is tweaking");
    }

    public static void main(String[] args) {
        tweakExceptions t = new tweakExceptions("My prof is tweaking");

        try{
            t.fuckThatTweaker();
        }catch(tweakExceptions e){
            System.out.println(e.getMessage());
        }
    }
}
