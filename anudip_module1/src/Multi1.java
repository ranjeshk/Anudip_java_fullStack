public class Multi1 extends  Thread  {
    @Override
    public void run() {
        for(int i = 1; i < 5; i++) {
            String t = Thread.currentThread().getName();
            System.out.println(t + " " +i);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Multi1 obj =new Multi1();
            System.out.println("order of excecution");
            obj.run();
        }
    }
}
