public class App {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        for(int i=0;i<20;i++){
            queue.enqueue(i);
        }
        for(int i=0;i<19;i++){
            queue.dequeue();
        }
        System.out.println(queue.empty());
        queue.displayQueue();
        
    }
}
