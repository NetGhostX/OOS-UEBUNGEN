public class SeaBearGuardProxy implements BearProtectInterface{
    private int visitorCode;
    private int age;

    private SeaBearOriginal searBear = new SeaBearOriginal();
    /**
     * @param visitorCode
     */
    @Override
    public void allowVisit(int visitorCode) {
        if(visitorCode == 1){
            System.out.println("allow visit");
        }else{
            System.out.println("Only visitors with code 1 are allowed to visit.");
        }
    }

    public void assignVisitorCode( int age) {
        if(age > 18){
            this.visitorCode = 1;
        }else{
            this.visitorCode = 0;
            System.out.println();
        }
    }
}
