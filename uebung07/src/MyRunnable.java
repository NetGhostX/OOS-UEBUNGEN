public class MyRunnable implements Runnable{
    public String threadName;
    public MyRunnable(String name){
        this.threadName = name;
    }
    @Override
    public void run(){
        for(int i = 5; i > 0; --i){
            try{
                Thread.sleep(1000);
                System.out.println(this.threadName+ ": " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
