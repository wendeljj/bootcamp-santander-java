package CollectionsClassesUteis.Threads;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
/*
    private final static LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>() {
    };


    private static void inc(int number){
        numbers.add(number);
    }

    private static void show(){
        System.out.println(numbers);
    }

 */

    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    static void main() throws InterruptedException {

        Runnable inc = () -> {
            for (int i = 0; i < 10_000; i++) {
                atomicInteger.incrementAndGet();
            }
        };

        Runnable dec = () -> {
            for (int i = 0; i > -10_000; i--) {
                atomicInteger.decrementAndGet();
            }
        };

        Runnable show = () -> {
            for (int i = 0; i < 250; i++) {
                System.out.println(atomicInteger);
            }
        };

        Thread incExec = new Thread(inc);
        incExec.start();

        Thread decExec = new Thread(dec);
        decExec.start();

        Thread showExec = new Thread(show);
        showExec.start();



        /*
        Runnable inc = () ->{
          for (int i = 0; i < 100; i++){
              inc(i);
          }
        };

        Runnable dec = () -> {
          for (int i = 0; i > -100; i--){
              inc(i);
          }
        };

        Runnable show = () -> {

            for (int i = 0; i < 250; i++){
                show();
            }

        };

        Thread thread1 = new Thread(inc);
        thread1.start();
        Thread thread2 = new Thread(dec);
        thread2.start();
        thread2.join(Duration.ofSeconds(8));
        Thread thread3 = new Thread(show);
        thread3.start();
        */

    }
}
