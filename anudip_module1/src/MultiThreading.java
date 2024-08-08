import javax.imageio.stream.ImageInputStream;

public class MultiThreading extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().threadId() +" "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

    public static void main(String[] args) {
        MultiThreading obj1 = new MultiThreading();
        MultiThreading obj2 = new MultiThreading();
        obj1.start();
        obj2.start();
    }
}