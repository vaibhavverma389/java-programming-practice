import java.util.Random;
import java.util.Scanner;

public class guessn {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int a;
        do{
            System.out.println("Enter number ");
            a=sc.nextInt();
            if(a>num)
            {
                System.out.println("Too Hight");
            }
            else if(a<num)
            {
                System.out.println("Too Small");
            }
            else
            {
                System.out.println("Correct guess");
            }
        }while(a!=num);

    }
    
}
