package polymorphysm;

public class Bike extends Vehicle{
    void run()
    {
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) {
        // write your code here

        Bike obj=new Bike();
        obj.run();

    }
}
