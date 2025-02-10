public class SeaBearOriginal implements  BearProtectInterface{
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

}
