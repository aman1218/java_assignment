package assgn5;

public class ThreadExample extends Thread {
    public ThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            
            System.out.println("Current thread: " + this.getName());
            
            
            Thread.sleep(5000);
            
            
            this.setName("ChangedThreadName");
            
            
            System.out.println("Thread name after sleep: " + this.getName());
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        
        ThreadExample thread = new ThreadExample("InitialThreadName");
        
        
        thread.start();
    }
}
