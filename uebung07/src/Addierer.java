public class Addierer implements Runnable{

    public String threadName;
    public Addierer(String text){
        this.threadName = text;
    }
    public int a = 0;
    @Override
    public void run(){
        for(int i = 1; i <=100000; i++){
            try{
            Thread.sleep(0);
            synchronized (this) {
                a++;
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread: " + threadName  + ": "+ a);
        }
    }

    public static void main(String[] args)  {
        Thread thread1 = new Thread(new Addierer("Thread01"));
        Thread thread2 = new Thread(new Addierer("Thread02"));
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
