package abstraction;

public class Honda4 extends Bike{
    void run()
    {
        System.out.println("Running safely");
    }
    public static void main(String[] args) {
        // write your code here
        Bike obj = new Honda4();
        obj.run();

    }
}
