
import java.util.Scanner;

public class Gradec {
    public  static String gradecal(int a)
    {
        if(a>100)
        {
            return "Invaild number please in to 0 tp 100";
        }
        if(a>90)
        {
            return "A";
        }
        if(a>80)
        {
            return "B";
        }
        if(a>70)
        {
            return "C";
        }
        if(a>60)
        {
            return "D";
        }
        return "F";
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks 0 to 100");
        int num=sc.nextInt();
        System.out.print(gradecal(num));
    }
    
}
