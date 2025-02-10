import java.util.concurrent.TimeUnit;

public class ParkingSyncNofity {
    private static NotifyCounter x = new NotifyCounter();

    public static void main(String[] args) {
        outGateNotify a = new outGateNotify(x);
        outGateNotify b = new outGateNotify(x);
        outGateNotify c = new outGateNotify(x);
        outGateNotify d = new outGateNotify(x);
        outGateNotify e = new outGateNotify(x);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        synchronized (x){
            System.out.println("Main calls nofity");
            x.notify();
        }
    }
}
