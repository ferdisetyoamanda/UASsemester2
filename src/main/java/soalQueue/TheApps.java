package soalQueue;
public class TheApps {
    public static void main(String[] args) {
        mainQueue newQueue = new mainQueue(10);
        newQueue.enqueue(50);
        newQueue.show();
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        System.out.println("Nama saya adalah : Ferdi Setyo Amanda");
        newQueue.enqueue(70);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        
        System.out.println("data paling depan = "+newQueue.peek());
    }
}
