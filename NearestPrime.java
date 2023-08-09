import java.util.*;
public class NearestPrime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int i = a-1;
        boolean b = true;
        boolean c = false;
    
        while(b)
        {
            i++;
            if(prime(i))
            {
                b=false;
            }
        }
        b=true;
        int z = a+1;
        while(b)
        {
            z--;
            if(prime(z))
            {
                b=false;
            }
        }
        System.out.println(Math.min(a-z,i-a));
    }
    public static boolean prime(int n)
    {
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

