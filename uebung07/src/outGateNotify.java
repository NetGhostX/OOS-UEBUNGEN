public class outGateNotify extends Thread {
    NotifyCounter count;
    public outGateNotify(NotifyCounter c){
        this.count = c;
    }

    @Override
    public void run(){
    synchronized(count){
        try {
            count.wait();
            count.inc();
            count.notify();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
