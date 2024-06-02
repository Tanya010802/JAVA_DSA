import java.util.*;
public class largest_num
{
    public static int largest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {largest=numbers[i];}

        }
        return largest;
    }
    public static void main(String args[])
    {
         int numbers[]={10,2,8,5,6};
         System.out.println(largest(numbers));
          
    }
}