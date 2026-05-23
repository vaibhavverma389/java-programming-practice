import java.util.Scanner;

public class arrayavg {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int a=sc.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println("Sum of Arrays" + sum);;
        System.out.println("Avg of Arrays"+ (double)sum/a);
    }
    
}
