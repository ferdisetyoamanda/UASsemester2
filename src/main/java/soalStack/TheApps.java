package soalStack;
public class TheApps { //20090159
    public static void main(String[] args) {
        MainStack newStack = new MainStack(10);
        newStack.push(19);
        newStack.printData();
        newStack.push(30);
        newStack.printData();
        long bacaTop = newStack.peek();
        System.out.println("Nama saya adalah : Ferdi Setyo Amanda");
        System.out.println("Nilai yang dihapus ="+newStack.pop());
        newStack.printData();
        newStack.push(40);
        newStack.printData();
        newStack.push(50);
        newStack.printData();
        
    }
}
