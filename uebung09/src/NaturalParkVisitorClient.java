public class NaturalParkVisitorClient implements BearProtectInterface{
    /**
     * @param visitorCode
     */
    @Override
    public void allowVisit(int visitorCode) {
        BearProtectInterface searBearProx = new SeaBearGuardProxy();
        searBearProx.allowVisit(18);
    }
}
