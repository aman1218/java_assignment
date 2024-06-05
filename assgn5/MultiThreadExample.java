package assgn5;

public class MultiThreadExample extends Thread {
    public MultiThreadExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                // Print the current thread name
                System.out.println("Executing " + this.getName());
                
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " interrupted");
        }
    }

    public static void main(String[] args) {
        // Create a thread with an initial name
        MultiThreadExample userThread = new MultiThreadExample("UserThread");

        // Start the user-defined thread
        userThread.start();

        // Create and start a thread in the main method
        Thread mainThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    // Print the current thread name
                    System.out.println("Executing MainThread");
                    
                    // Sleep for 1 second (1000 milliseconds)
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("MainThread interrupted");
            }
        });

        // Start the main method thread
        mainThread.start();
    }
}
