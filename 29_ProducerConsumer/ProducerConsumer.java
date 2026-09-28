import java.util.concurrent.*;
public class ProducerConsumer {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> q=new ArrayBlockingQueue<>(3);
        Thread producer=new Thread(()->{try{for(int i=1;i<=5;i++){q.put(i);System.out.println("Produced "+i);}}catch(InterruptedException e){Thread.currentThread().interrupt();}});
        Thread consumer=new Thread(()->{try{for(int i=1;i<=5;i++){System.out.println("Consumed "+q.take());}}catch(InterruptedException e){Thread.currentThread().interrupt();}});
        producer.start();consumer.start();producer.join();consumer.join();
    }
}