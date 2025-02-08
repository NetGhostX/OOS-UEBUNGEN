public class ExWerfenUndWeiterleiten {
    static void ExwerfenWeiterleiten()throws MeineException {
        throw new MeineException("My professor is making me wanna tweak. He is gonna keep fucking around and find out");
    }

    public static void main(String[] args) {
        boolean IshouldBeTweaking = true;
        try {
            if(IshouldBeTweaking) {
                ExwerfenWeiterleiten();
            }
        }catch (MeineException e){
            System.out.println(e.getMessage());
        }
        //finally block ensures that certain code is always executed, regardless of whether an exceptions occur or not.
    }

}
