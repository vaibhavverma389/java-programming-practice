import java.util.*;
public class simplecal {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int ans=0;
        int b=sc.nextInt();
        System.out.println("select 1 to 4 1 for add 2 for subtract 3 for multiply 4 for devide");
        int opr = sc.nextInt();
        if(opr==1)
        {
            ans=a+b;
        }
        else if(opr==2)
        {
            ans=a-b;
        }
        else if(opr==3)
        {
            ans=a*b;
        }
        else 
        {
            ans=a/b;
        }
        System.out.println(ans);


    }
    
}
