package General;

import java.util.Scanner;

public class Fibbonacci {
    void calculate()
    {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int firstNum=1;
        int secondNum=2;
        int fibbonacciNum;
        for (int x=0;x<n-2;x++)
        {
            fibbonacciNum=firstNum+secondNum;
            System.out.println(fibbonacciNum);
            firstNum=secondNum;
            secondNum=fibbonacciNum;

        }
    }
    public static void main(String[] args) {

        Fibbonacci obj = new Fibbonacci();
        obj.calculate();

    }
}
