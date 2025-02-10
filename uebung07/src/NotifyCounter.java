public class NotifyCounter {
    public int count = 50;
    public int limit = 100;
    public void inc(){
        if(count < limit){
            count++;
            System.out.println("Cap++" + this.count);
        }

    }
    public void dec(){
        if(this.count > 0){
            count--;
            System.out.println("Cap--" + this.count);
        }
    }
}
