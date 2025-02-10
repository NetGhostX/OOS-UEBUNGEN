public class Addierer implements Runnable{

    public int a = 0;
    @Override
    public void run(){
        for(int i = 0; i <=100000; i++){
            try{
            Thread.sleep(5);
            a++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("current value of a: " + Thread.currentThread().getName()  + a);
        }
    }

    public static void main(String[] args)  {
        Thread thread1 = new Thread(new Addierer());
        Thread thread2 = new Thread(new Addierer());
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
