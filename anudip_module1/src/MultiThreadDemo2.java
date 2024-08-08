public class MultiThreadDemo2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            String t = Thread.currentThread().getName();
            System.out.println("Thread name " + t + " i value " + i);
//            try {
//                Thread.sleep(5000);
//            }
//            catch (Exception e){
//
//            }
        }
    }

    public static void main(String[] args) {
        Thread obj1 = new Thread(new MultiThreadDemo2());
        obj1.start();

        Thread obj2 = new Thread(new MultiThreadDemo2());
        obj2.start();
    }
}
