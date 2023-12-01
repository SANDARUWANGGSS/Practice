package General;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {10,5,7,2,8,3,34,50};
        int n = arr.length;
        if(n<2)
        {
            System.out.println("Array should have at least two elements");
        }
        int firstMax=arr[0];
        int secondMax=arr[0];

        for (int i=1;i<n;i++)
        {
            if(arr[i]>firstMax)
            {
                secondMax=firstMax;
                firstMax=arr[i];
            }else if (arr[i]>secondMax && arr[i]!=firstMax)
            {
                secondMax=arr[i];
            }
        }
        if(secondMax==firstMax)
        {
            System.out.println("There is no second largest element");
        }
        System.out.println(secondMax);
//        System.out.println(firstMax);
    }
}
