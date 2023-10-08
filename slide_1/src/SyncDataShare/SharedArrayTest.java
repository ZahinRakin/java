package SyncDataShare;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest {
    public static void main(String []args){
        SimpleArray shareSimpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1, shareSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, shareSimpleArray);
        
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(writer1);
        executor.execute(writer2);

        executor.shutdown();

        try{
            boolean tasksEned = executor.awaitTermination(1, TimeUnit.MINUTES);
            if(tasksEned){
                System.out.println(shareSimpleArray);
            }else{
                System.out.println("Timed out when waiting for the tasks to finish.");
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted while wait for tasks to finish.");
        }
    }
}
