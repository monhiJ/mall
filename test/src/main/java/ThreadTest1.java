public class ThreadTest1 implements Runnable{

    private int i = 1;


    public void run() {
        while (i <= 100){
            synchronized (this){
                notify();
                try {
                    Thread.sleep(100);
                } catch (Exception e){
                    e.printStackTrace();
                }
                if(i <= 100){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    i++;
                    try {
                        if(i<100){
                            wait();
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
