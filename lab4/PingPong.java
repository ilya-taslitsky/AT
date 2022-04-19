public class PingPong implements Runnable
{
    public String message;

    public PingPong(String message)
    {
        this.message=message;
    }
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread ping = new Thread(new PingPong("Ping"));
        Thread pong = new Thread(new PingPong("Pong"));
        ping.start();
        pong.start();
    }


}
