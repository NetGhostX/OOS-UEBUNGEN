public class inGateNotify extends Thread{
    NotifyCounter count;
    public inGateNotify(NotifyCounter c){
        this.count = c;
    }

    @Override
    public void run(){
        synchronized (count){
            try{
                count.wait();
                count.dec();
                count.notify();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
