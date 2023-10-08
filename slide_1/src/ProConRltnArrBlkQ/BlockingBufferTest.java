package ProConRltnArrBlkQ;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// import ProConRltnWoutSync.Consumer;
// import ProConRltnWoutSync.Producer;//this is how to import packages in java. new stuff.

public class BlockingBufferTest {
    public static void main(String []args){
        ExecutorService application = Executors.newCachedThreadPool();
        Buffer sharedLocation = new BlockingBuffer();

        application.execute(new Producer(sharedLocation));
        application.execute(new Consumer(sharedLocation));
        application.shutdown();
    }
}
